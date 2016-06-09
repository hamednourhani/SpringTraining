package ir.itstar.Test;

import ir.itstar.CDPlayer.CDPlayerInterface;
import ir.itstar.CDPlayer.CDcompact;
import ir.itstar.Config.CDPLayerConfig;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static  org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by itstar on 2016/06/08.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPLayerConfig.class)
public class CDPLayerTest {



    @Autowired(required = false)
    private CDcompact cd;

    @Autowired
    private CDPlayerInterface cdPLayer;

    @Autowired
    private CDPlayerInterface cdNewPlayer;

    @Test
    public void cdMustNotNull(){
        assertNotNull(cd);
    }

    @Test
    public void cdPlayerMustNotNull(){
        assertNotNull(cdPLayer);
        assertEquals(cdPLayer.getThisBeanName(),"cDPlayerInterface");
    }

    @Test
    public void cdMustBeInCDPLayer(){
        assertNotNull(cdPLayer.getCD());
    }

    @Test
    public void cdTitleMustEqual(){
        assertEquals(cdPLayer.getCDTitle() , "Hamed CD");
    }

    @Test
    public void cdTitleMustNotNull(){
        assertNotNull(cdPLayer.getCDTitle());
    }
}
