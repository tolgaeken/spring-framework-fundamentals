package dev.tolga.p17aspectorientedprogramming.implementation;


import dev.tolga.p17aspectorientedprogramming.interfaces.Speakers;
import dev.tolga.p17aspectorientedprogramming.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(Song song){
        return "Playing the song "+ song.getTitle()+ " by "
                + song.getSingerName()+
                " with Bose speakers";
    }

}
