package dev.tolga.p14singletonbeans.implementation;


import dev.tolga.p14singletonbeans.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    public String makeSound(){
        return "Playing music with Sony speakers";
    }

}
