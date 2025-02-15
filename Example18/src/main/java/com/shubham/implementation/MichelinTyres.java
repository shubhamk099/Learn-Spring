package com.shubham.implementation;

import com.shubham.interfaces.Tyers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "michelinTyresBean")
@Primary
public class MichelinTyres implements Tyers {
    @Override
    public String rotate() {
        return "Vehicle moving with the Michelin Tyres";
    }
}
