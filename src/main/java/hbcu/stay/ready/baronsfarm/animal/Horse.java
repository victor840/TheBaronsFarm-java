package hbcu.stay.ready.baronsfarm.animal;

import hbcu.stay.ready.baronsfarm.edible.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;

public class Horse implements Rideable, Animal {
    @Override
    public String eat(Edible edible) {
        String horseMsg = "";
        if(edible!=null){
            horseMsg += "Edible got me litty! >_<";
        }
        return horseMsg;
    }

    @Override
    public String makeNoise() {

        return "**Neighhhhh**";
    }
}
