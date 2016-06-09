package ir.itstar.CDPlayer;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * Created by itstar on 2016/06/08.
 */


//@Component("myFirstCD")
public class FirstCD implements CDcompact {

    private String Title = "CD Title";
    private String Artist = "Hamed";
    private String Name;
//    public String getTitle() {
//        return Title;
//    }
//
//    public void setTitle(String title) {
//        Title = title;
//    }
//
//
//
//    public String getArtist() {
//        return Artist;
//    }
//
//    public void setArtist(String artist) {
//        Artist = artist;
//    }



    @Override
    public void play() {
        System.out.println("i am playing . CD One");


    }

    @Override
    public String getTitle() {
        return this.Title;
    }


}
