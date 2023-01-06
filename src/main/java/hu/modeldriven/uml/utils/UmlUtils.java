package hu.modeldriven.uml.utils;

import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.NamedElement;

public class UmlUtils {


    // https://github.com/KamilRosiak/e4CompareFramework/blob/68131047bef829a4173c9174e0d567ab1e873548/de.tu_bs.cs.isf.e4cf.compare.data_structures/src/de/tu_bs/cs/isf/e4cf/compare/data_structures/util/ModelUtil.java

    public static String getXmiId(NamedElement namedElement) {
        if (namedElement.eResource() instanceof XMIResource) {
            String objectID = ((XMIResource) namedElement.eResource()).getID(namedElement);
            return objectID;
        }
        return "<undefined xmi.id>";
    }

}
