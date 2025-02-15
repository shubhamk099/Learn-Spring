package com.shubham.implementation;

import com.shubham.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "sonySpeakersBean")
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Playing music from Sony Speakers";
    }
}
