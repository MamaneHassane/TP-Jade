package package1;

import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class SimpleContainer1 {
    public static void main(String[] args)throws Exception {
        try {
            Runtime runtime = Runtime.instance();
            ProfileImpl profilImpl = new ProfileImpl();
            profilImpl.setParameter(Profile.MAIN_HOST, "localhost");
            AgentContainer agentContainer = runtime.createAgentContainer(profilImpl);
            AgentController agentController=agentContainer.createNewAgent("robot","package1.FirstAgent", new Object[]{"YES", "time=10seconde"});
            agentController.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}