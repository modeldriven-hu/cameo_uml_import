package gettingstarted;

import hu.modeldriven.uml.magicdraw.MagicDrawModel;
import hu.modeldriven.uml.magicdraw.MagicDrawModelUtils;
import org.eclipse.uml2.uml.Model;

import java.io.File;

public class LoadUML2 {

    public static void processModel(Model model) {

        var name = model.getName();
        System.out.println(name);

        var members = model.getMembers();

        for (var namedElement : members) {
            System.out.println(MagicDrawModelUtils.getXmiId(namedElement));
            System.out.println(namedElement.getName());
        }
    }

    public static void main(String[] args) throws Exception {
        var model = MagicDrawModel.fromSingleFile(new File("./src/test/resources/ExtendedPO2.uml")).open();
        processModel(model);
    }

}
