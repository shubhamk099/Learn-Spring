package com.shubham.implementation;

import com.shubham.interfaces.Tyers;
import org.springframework.stereotype.Component;

@Component(value = "bridgeStoneTyresBean")
public class BridgeStoneTyres implements Tyers {
    @Override
    public String rotate() {
        return "Vehicle moving with BridgeStone Tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with BridgeStone Tyres";
    }
}
