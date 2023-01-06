package hu.modeldriven.uml.magicdraw;

import hu.modeldriven.uml.magicdraw.internal.MagicDrawMDZipReader;
import hu.modeldriven.uml.magicdraw.internal.MagicDrawModelReader;
import hu.modeldriven.uml.magicdraw.internal.MagicDrawSingleFileReader;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import java.io.File;

public class MagicDrawModel {

    public static MagicDrawModelReader fromSingleFile(File file){
        return new MagicDrawSingleFileReader(file);
    }

    public static MagicDrawModelReader fromMDZip(File file){
        return new MagicDrawMDZipReader(file);
    }

}
