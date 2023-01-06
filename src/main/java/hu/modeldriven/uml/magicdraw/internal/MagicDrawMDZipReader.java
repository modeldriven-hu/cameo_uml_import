package hu.modeldriven.uml.magicdraw.internal;

import hu.modeldriven.uml.magicdraw.InvalidModelFormatException;
import org.eclipse.uml2.uml.Model;

import java.io.File;

public class MagicDrawMDZipReader implements MagicDrawModelReader{

    private File file;

    public MagicDrawMDZipReader(File file){
        this.file = file;
    }

    @Override
    public Model open() throws InvalidModelFormatException {
        // TODO
        // Check if file is a zip
        // Open ZIP
        // Get file
        // Open file
        // Handle imports and other stuff as well
        // This might become complicated very fast :D
        return null;
    }
}
