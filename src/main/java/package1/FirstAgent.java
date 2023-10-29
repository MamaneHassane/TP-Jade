package package1;

import jade.core.Agent;

public class FirstAgent extends Agent {
    @Override
    protected void setup () {
        Object[] args = getArguments();
        if((args[0]).equals("YES")) {
            System.out.println(
                    "Bonjour l'agent :"+
                            this.getAID().getName()+
                            ", Bienvenue, tu as "+
                            ((String)args[1])+
                            " pour terminer la tache");
        }
        else{
            System.out.println("don’t Let go");
        }
    }

    @Override
    protected void beforeMove() {
        System.out.println("...Avant de me déplacer...");
    }

    @Override
    protected void afterMove() {
        System.out.println("...Après mon déplacement...");
    }
}
