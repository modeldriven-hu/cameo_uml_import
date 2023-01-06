package hu.modeldriven.uml.magicdraw.internal;

import hu.modeldriven.uml.magicdraw.InvalidModelFormatException;
import org.eclipse.uml2.uml.Model;

public interface MagicDrawModelReader {

    Model open() throws InvalidModelFormatException;

}
