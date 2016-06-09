package ir.itstar.CDPlayer;

import org.springframework.stereotype.Component;

/**
 * Created by itstar on 2016/06/09.
 */
//@Component
public class SecoundCD implements CDcompact {

    private String Title;

    public SecoundCD(){

    }

    public SecoundCD(String title){
        this.Title = title;
    }
    @Override
    public void play() {
        System.out.println("I am Second CD");
    }

    @Override
    public String getTitle() {
        return this.Title;
    }
}
