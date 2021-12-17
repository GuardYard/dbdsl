package org.xtext.miniproject2.dbscript.dsl.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.After

import com.google.inject.Injector
import org.xtext.miniproject2.dbscript.dsl.DbDSLStandaloneSetup
import org.xtext.miniproject2.dbscript.dsl.dbDSL.Database
import org.xtext.miniproject2.dbscript.dsl.dbDSL.Table
import org.xtext.miniproject2.dbscript.dsl.dbDSL.AbstractType
import org.xtext.miniproject2.dbscript.dsl.dbDSL.PrimaryKey
import org.xtext.miniproject2.dbscript.dsl.dbDSL.Column
import org.xtext.miniproject2.dbscript.dsl.dbDSL.Insert

class Globals{
	static int count = 0
	static table = ""
	static text2 = ""
	static text3 = ""
	
}
class DbDSLTraverse {
	
		def static void main(String[] args) {
		def path = 'src/main/resources/example.dbdsl'
		
		println solution(path)
	}

	def static solution = { path ->
		String text = ''
		
		Injector injector = new DbDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		Resource resource = resourceSet.getResource(URI.createFileURI(path), true);
		
		Database database = resource.getContents().get(0)

		text += traverse(database)
		text += "\n"
		text += Globals.text2
		text += "\n"
		text += Globals.text3
		
		text
	}
	
	def static String traverse(List<EObject> list) {
		String text = ''
		for (obj in list) {
			text += traverse(obj)
		}
		text
	}
	
	def static String traverse(EObject obj) {
    String text = ''

	switch (obj) {
        case Database :
            text += generate(obj)
            text += traverse(obj.tables)
			text += traverse(obj.inserts)
            break

        case Table :
            Globals.table = obj.name
            Globals.count = obj.columns.size()
			text += generate(obj)
			text += traverse(obj.columns)
			text += """);\n"""
            break

        case PrimaryKey :
            text += generate(obj)
            break

        case Column :
            text += generate(obj)
            break
			
		case Insert :
			text += generate(obj)
			break
    }
    text
}
	def static generate(EObject obj) {
	    String text = ''
	    switch (obj) {
	
	        case Database :
				text += """CREATE DATABASE ${obj.name};\n"""
	            break
				
			case Table :
				text += """CREATE TABLE `${obj.name}` (\n"""
				break
	
	        case PrimaryKey :
				text += """  `${obj.name}` ${obj.type} PRIMARY KEY"""
		            if (obj.autoIncrement != null) {
		                text += """ AUTO_INCREMENT"""
				}
				Globals.count--
				text += ',\n'
				break
	        case Column :
				
				text += """  `${obj.name}` ${obj.type}"""
				Globals.count--
				if (Globals.count != 0){
					text += ','
				}
				if (obj.sourceTable != null){
					def elems = obj.sourceTable.columns.findAll { it ->
						String a = it.getProperties().get("class")
						a == "class co7217.dsl.ucd.useCaseDSL.impl.PrimaryKeyImpl"
						}
					def elemsName = elems*.name
					Globals.text2 += """ALTER TABLE `${Globals.table}` ADD FOREIGN KEY (`${obj.name}`) REFERENCES `${obj.sourceTable.name}` (`${elemsName[0]}`);\n"""
	            }
				text += """\n"""
	            break
				
			case Insert :
				Globals.text3 += """INSERT INTO ${obj.table.name}"""
				Globals.text3 += """("""
				def elems = obj.table.columns.findAll { it ->
					String a = it.getProperties().get("class")
					a == "class co7217.dsl.ucd.useCaseDSL.impl.ColumnImpl"
					}
				def elemsName = elems*.name
				Globals.text3 += """${elemsName.join(',')}"""

				Globals.text3 += """)\nVALUES ("""
				Globals.text3 += """'${obj.var.join(',')}'"""
				Globals.text3 +=  """);"""
				break
	    }
	    text
	}
}
