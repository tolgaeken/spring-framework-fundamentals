package dev.tolga.p17aspectorientedprogramming.implementation;


import dev.tolga.p17aspectorientedprogramming.interfaces.Speakers;
import dev.tolga.p17aspectorientedprogramming.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    public String makeSound(Song song){
        return "Playing the song "+ song.getTitle()+ " by "
                + song.getSingerName()+
                " with Sony speakers";
    }

}
