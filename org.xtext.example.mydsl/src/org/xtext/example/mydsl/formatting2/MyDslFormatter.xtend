/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.formatting2

import com.google.inject.Inject
import mdsd.component_based.EInterface
import mdsd.component_based.ESystem
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(ESystem eSystem, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (eRepository : eSystem.containsRepos) {
			eRepository.format
		}
		for (eContainer : eSystem.containsContainers) {
			eContainer.format
		}
	}

	def dispatch void format(EInterface eInterface, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (eSignature : eInterface.signature) {
			eSignature.format
		}
	}
	
	// TODO: implement for ECompositeComponent, EAssemblyContext, ESystemIndependentViewPoint, EAssemblyViewPoint, EDeploymentViewPoint, EAssemblyViewType, EAllocationViewType, EComponent, EBehaviourDescription, ESignature, ERepository
}
