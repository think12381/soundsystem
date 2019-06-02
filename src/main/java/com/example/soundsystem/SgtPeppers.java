package com.example.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt. Pepper lonely hearts club band";
    private String artist = "The Beatles";

    public void play(){
        System.out.println("play" + title + "artist" + artist);
    }

}
