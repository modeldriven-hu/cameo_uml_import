package hu.modeldriven.uml.magicdraw.internal;

import hu.modeldriven.uml.magicdraw.InvalidModelFormatException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import java.io.File;

public class MagicDrawSingleFileReader implements MagicDrawModelReader {

    private File file;

    public MagicDrawSingleFileReader(File file){
        this.file = file;
    }

    @Override
    public Model open() throws InvalidModelFormatException {
        // Create a resource-set to contain the resource(s) that we are saving
        ResourceSet resourceSet = new ResourceSetImpl();

        // Initialize registrations of resource factories, library models,
        // profiles, Ecore metadata, and other dependencies required for
        // serializing and working with UML resources. This is only necessary in
        // applications that are not hosted in the Eclipse platform run-time, in
        // which case these registrations are discovered automatically from
        // Eclipse extension points.
        UMLResourcesUtil.init(resourceSet);

        // Create URI from file
        URI uri = URI.createFileURI(file.getAbsolutePath());

        // Read file
        var resource = resourceSet.getResource(uri, true);

        var contents = resource.getContents();
        var firstObject = contents.get(0);

        if (firstObject instanceof Model) {
            return (Model)firstObject;
        }

        throw new InvalidModelFormatException();
    }
}
