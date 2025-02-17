package com.shubham.implementation;

import com.shubham.interfaces.Speakers;
import com.shubham.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "sonySpeakersBean")
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Playing the song " + song.getTitle() + " by " + song.getSingerName() + " with sony speakers";
    }
}
