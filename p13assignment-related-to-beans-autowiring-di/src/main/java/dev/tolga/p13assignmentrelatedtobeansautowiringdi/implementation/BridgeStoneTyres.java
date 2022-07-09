package dev.tolga.p13assignmentrelatedtobeansautowiringdi.implementation;

import dev.tolga.p13assignmentrelatedtobeansautowiringdi.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
