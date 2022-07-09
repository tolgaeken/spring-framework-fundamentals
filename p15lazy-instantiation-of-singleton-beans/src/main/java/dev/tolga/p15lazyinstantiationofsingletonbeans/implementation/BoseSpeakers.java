package dev.tolga.p15lazyinstantiationofsingletonbeans.implementation;


import dev.tolga.p15lazyinstantiationofsingletonbeans.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(){
        return "Playing music with Bose speakers";
    }

}
