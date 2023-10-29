package package1;

import jade.wrapper.AgentContainer;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.ControllerException;

public class MainContainer {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.instance();
            ProfileImpl profileImpl=new ProfileImpl();
            profileImpl.setParameter(Profile.GUI,"true");
            AgentContainer mainContainer= runtime.createMainContainer(profileImpl);
            mainContainer.start();

        } catch(ControllerException e) {
            e.printStackTrace();
        }
    }
}