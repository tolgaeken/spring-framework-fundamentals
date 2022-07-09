package dev.tolga.p13assignmentrelatedtobeansautowiringdi.implementation;

import dev.tolga.p13assignmentrelatedtobeansautowiringdi.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(){
        return "Playing music with Bose speakers";
    }

}
