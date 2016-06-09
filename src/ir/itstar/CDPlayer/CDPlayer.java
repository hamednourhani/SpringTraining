package ir.itstar.CDPlayer;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by itstar on 2016/06/09.
 */
//@Component("myCDPlayer")
public class CDPlayer implements CDPlayerInterface,BeanNameAware{


    private CDcompact cd;

    public String getThisBeanName() {
        return thisBeanName;
    }

    private String thisBeanName;


    public CDPlayer(){

    }

    @Autowired(required = false)
    public CDPlayer(CDcompact cd){
        this.cd = cd;
    }


    public void setCD(CDcompact cd) {
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }



    public CDcompact getCD(){
        return this.cd;
    }

    @Override
    public String getCDTitle() {
        return this.cd.getTitle();
    }

    @Override
    public void setBeanName(String name) {
        this.thisBeanName = name;
    }
}
