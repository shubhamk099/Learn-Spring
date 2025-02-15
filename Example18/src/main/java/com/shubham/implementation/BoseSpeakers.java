package com.shubham.implementation;

import com.shubham.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component(value = "boseSpeakersBean")
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Playing music with Bose Speakers";
    }
}
