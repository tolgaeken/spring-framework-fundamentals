package dev.tolga.p15lazyinstantiationofsingletonbeans.implementation;


import dev.tolga.p15lazyinstantiationofsingletonbeans.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
