package dev.tolga.p14singletonbeans.implementation;


import dev.tolga.p14singletonbeans.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
