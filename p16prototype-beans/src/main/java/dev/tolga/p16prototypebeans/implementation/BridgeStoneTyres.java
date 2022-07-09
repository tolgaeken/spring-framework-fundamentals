package dev.tolga.p16prototypebeans.implementation;


import dev.tolga.p16prototypebeans.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
