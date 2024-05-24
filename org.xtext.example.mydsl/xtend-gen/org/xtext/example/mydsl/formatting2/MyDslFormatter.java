/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import mdsd.component_based.EAssemblyContext;
import mdsd.component_based.EInterface;
import mdsd.component_based.ERole;
import mdsd.component_based.ESignature;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;

  protected void _format(final EAssemblyContext eAssemblyContext, @Extension final IFormattableDocument document) {
    EList<ERole> _roles = eAssemblyContext.getRoles();
    for (final ERole eRole : _roles) {
      document.<ERole>format(eRole);
    }
  }

  protected void _format(final EInterface eInterface, @Extension final IFormattableDocument document) {
    EList<ESignature> _signature = eInterface.getSignature();
    for (final ESignature eSignature : _signature) {
      document.<ESignature>format(eSignature);
    }
  }

  public void format(final Object eAssemblyContext, final IFormattableDocument document) {
    if (eAssemblyContext instanceof XtextResource) {
      _format((XtextResource)eAssemblyContext, document);
      return;
    } else if (eAssemblyContext instanceof EAssemblyContext) {
      _format((EAssemblyContext)eAssemblyContext, document);
      return;
    } else if (eAssemblyContext instanceof EInterface) {
      _format((EInterface)eAssemblyContext, document);
      return;
    } else if (eAssemblyContext instanceof EObject) {
      _format((EObject)eAssemblyContext, document);
      return;
    } else if (eAssemblyContext == null) {
      _format((Void)null, document);
      return;
    } else if (eAssemblyContext != null) {
      _format(eAssemblyContext, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eAssemblyContext, document).toString());
    }
  }
}