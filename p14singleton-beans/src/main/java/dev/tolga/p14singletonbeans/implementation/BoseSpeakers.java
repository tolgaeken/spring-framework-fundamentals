package dev.tolga.p14singletonbeans.implementation;


import dev.tolga.p14singletonbeans.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(){
        return "Playing music with Bose speakers";
    }

}
