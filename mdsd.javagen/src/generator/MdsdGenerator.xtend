package generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import mdsd.component_based.EInterface
import mdsd.component_based.ERepositoryViewType
import mdsd.component_based.EComponent
import org.eclipse.xtend2.lib.StringConcatenation
import mdsd.component_based.ESignature
import mdsd.component_based.PossibleReturnTypes
import org.eclipse.emf.common.util.EList
import mdsd.component_based.EParameter
import mdsd.component_based.PossibleParameterTypes

class MdsdGenerator implements IGenerator {
	
	var repoCount = 1
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
         resource.allContents.forEach[e |
            if (e instanceof ERepositoryViewType) {
                generateRepoJava(e as ERepositoryViewType, fsa)
                repoCount++
            }
        ]
    }
	
	def generateRepoJava(ERepositoryViewType type, IFileSystemAccess fsa) {
		
		generateHelperClass(fsa)
		
		var interfaces = type.showsInterfaces
		var components = type.showsComponents
		
		var repoName = "repository" + repoCount
		
		for (i : interfaces) {
			generateInterfaceJava(i, repoName, fsa)
		}
		
		for (c : components) {
			generateComponentJava(c, repoName, fsa)
		}
	}
	
	def generateHelperClass(IFileSystemAccess fsa) {
		var content = '''
		public class Helper {
			
			public static void assertNull (Object obj) throws RuntimeException {
				if (obj != null) {
					throw new RuntimeException("object is not null");
				}
			}
			
			public static void assertNotNull (Object obj) throws RuntimeException {
				if (obj == null) {
					throw new RuntimeException("object is null");
				}
			}
		}
		'''
		
		fsa.generateFile("Helper.java", content)
	}
	
	def generateComponentJava(EComponent component, String repoName, IFileSystemAccess fsa) {
		var provides = component.provides
		var requires = component.requires
		var className = component.name + "Impl"
		var fileName = className + ".java"
		
		var builder = new StringConcatenation
		builder.append('''package «component.name»''')
		builder.append("\n\n")
		
		for (p : provides + requires) {
			builder.append('''import «repoName».«p.name»;''')
			builder.append("\n")
		}
		
		
		builder.append("\n\n")
		builder.append('''public class «className»''')
		
		if (provides.length > 0 ) {
			
			var toAdd = ""
			for (i : provides) {
				toAdd += i.name
				toAdd += ", "
			}
			
			if (toAdd.length > 1) {
				toAdd = toAdd.substring(0, toAdd.length - 2)
				toAdd = " implements " + toAdd
			}
			
			builder.append(toAdd)
		}
		
		builder.append("{\n")
		
		for (req : requires) {
			builder.append(generatePrivateField(req) + "\n\n")
			builder.append(generateSetterMethod(req) + "\n\n")
		}
		
		for (prov: provides) {
			builder.append(generateProvidingMethod(prov) + "\n\n")
		}
		
		
		builder.append("}\n")
		fsa.generateFile(repoName + "/" + component.name + "/" + fileName, builder.toString)
	}
	
	def generateProvidingMethod(EInterface interface1) {
		var builder = new StringConcatenation
		var lowerName = firstCharToLowerCase(interface1.name)
		
		for (sig : interface1.signature) {
			var returnType = getReturnType(sig.returnType)
			var parameterString = getParameterString(sig.parameter)
		
			builder.append('''	//Implementing «sig.name» from interface «interface1.name»''')
			builder.append("\n	@Override\n")
			builder.append('''	public «returnType» «sig.name»(«parameterString») {''')
			builder.append("\n")
			builder.append('''		Helper.assertNotNull(this.«lowerName»);''')
			builder.append("\n		// TODO: Insert code here\n")
			builder.append("	}\n\n")
			
		}
		return builder.toString()
	}
	
	def generateSetterMethod(EInterface interface1) {
		var lowerCaseName = firstCharToLowerCase(interface1.name)
		'''	public void set«interface1.name»(«interface1.name» «lowerCaseName») {
		Helper.assertNull(this.«lowerCaseName»);
		this.«lowerCaseName» = «lowerCaseName»;
	}
		'''
	}
	
	def generatePrivateField(EInterface interface1) {
		'''	«interface1.name» «firstCharToLowerCase(interface1.name)»;'''
	}
	
	def generateInterfaceJava(EInterface interface1, String repoName, IFileSystemAccess fsa) {
		var fileName = interface1.name + ".java"
		var builder = new StringConcatenation
		
		builder.append('''package «repoName»''')
		builder.append("\n\n")
		builder.append('''public interface «interface1.name» {''')
		builder.append("\n")
		
		for (sig : interface1.signature) {
			builder.append(generateInterfaceMethod(sig))
		}
		
		builder.append("}\n")
		
		fsa.generateFile(repoName + "/" + fileName, builder.toString)
	}
	
	def generateInterfaceMethod(ESignature signature) {
		var returnType = getReturnType(signature.returnType)
		var parameterString = getParameterString(signature.parameter)
		
		'''
		
			public «returnType» «signature.name» («parameterString») {}
		
		'''
	}
	
	def getParameterString(EList<EParameter> list) {
		var parameterString = ""
		
		for (param : list) {
			var paramType = getParamType(param.type)
			parameterString += '''«paramType» «param.name», '''
		}
		
		if (parameterString.length > 1) {
			parameterString = parameterString.substring(0, parameterString.length - 2)
		}
		
		return parameterString
	}
	
	def getParamType(PossibleParameterTypes type) {
		switch (type) {
			case INT: "int"
			case STRING: "String"
			case BOOLEAN: "boolean"
			case DOUBLE: "double"
			case CHAR: "char"
			case LONG: "long"
			case FLOAT: "float"
			default: "String"
		}
	}
	
	def getReturnType(PossibleReturnTypes type) {
		switch (type) {
			case INT: "int"
			case STRING: "String"
			case BOOLEAN: "boolean"
			case DOUBLE: "double"
			case CHAR: "char"
			case LONG: "long"
			case FLOAT: "float"
			case VOID: "void"
			default: "void"
		}
	}
    
    def firstCharToLowerCase(String s) {
    	if (s.isEmpty) return s
    	s.substring(0, 1).toLowerCase + s.substring(1)
    }

    
    
}
