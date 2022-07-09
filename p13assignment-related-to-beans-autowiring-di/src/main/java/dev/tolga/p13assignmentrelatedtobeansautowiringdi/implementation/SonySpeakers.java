package dev.tolga.p13assignmentrelatedtobeansautowiringdi.implementation;


import dev.tolga.p13assignmentrelatedtobeansautowiringdi.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    public String makeSound(){
        return "Playing music with Sony speakers";
    }

}
