package hu.modeldriven.uml;

import hu.modeldriven.uml.magicdraw.MagicDrawModel;
import hu.modeldriven.uml.utils.UmlUtils;
import org.eclipse.uml2.uml.Model;

import java.io.File;

public class TestLoadUMLFile {

    public static void processModel(Model model) {

        var name = model.getName();
        System.out.println(name);

        var members = model.getMembers();

        for (var namedElement : members) {
            System.out.println(UmlUtils.getXmiId(namedElement));
            System.out.println(namedElement.getName());
        }
    }

    public static void main(String[] args) throws Exception {
        var model = MagicDrawModel.fromSingleFile(new File("./src/test/resources/SingleBDDMagicDrawExported.uml")).open();
        processModel(model);
    }

}
