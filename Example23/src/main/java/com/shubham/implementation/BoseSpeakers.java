package com.shubham.implementation;

import com.shubham.interfaces.Speakers;
import com.shubham.model.Song;
import org.springframework.stereotype.Component;

@Component(value = "boseSpeakersBean")
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Playing the song " + song.getTitle() + " by " + song.getSingerName() + " with bose speakers";
    }
}
