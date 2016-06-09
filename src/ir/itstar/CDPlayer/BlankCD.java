package ir.itstar.CDPlayer;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by itstar on 2016/06/09.
 */
//@Component("myCD")
public class BlankCD implements CDcompact {

    public void setTracks(List<String> tracks) {
        Tracks = tracks;
    }

    private List<String> Tracks;

    public void setTitle(String title) {
        Title = title;
    }

    private String Title;

    public BlankCD(){

    }

    public BlankCD(String title,List<String> tracks){
        this.Title = title;
        Tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("I am Blank CD");
        for (String track :
                this.Tracks) {
            System.out.println("Track name : "+track );
        }
    }

    @Override
    public String getTitle() {
        return this.Title;
    }
}
