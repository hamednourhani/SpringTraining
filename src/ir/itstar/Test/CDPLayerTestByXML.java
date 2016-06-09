package ir.itstar.Test;

import ir.itstar.CDPlayer.CDPlayerInterface;
import ir.itstar.CDPlayer.CDcompact;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by itstar on 2016/06/09.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ir/itstar/Config/SecoundXmlConfig.xml",
        "classpath:ir/itstar/Config/CDConfiguration.xml"})
public class CDPLayerTestByXML {

    @Autowired
    private CDcompact cd;

    @Autowired
    private CDPlayerInterface cdPlayer;

    @Test
    public void cdMustNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void cdPlayerMustNotBeNull(){
        assertNotNull(cdPlayer);
    }

    @Test
    public void cdMustBeInCDPLayer(){
        assertNotNull(cdPlayer.getCD());
    }

    @Test
    public void cdTitleMustEqual(){
        assertEquals(cdPlayer.getCDTitle() , "CDTITLE");
    }

    @Test
    public void cdTitleMustNotNull(){
        assertNotNull(cdPlayer.getCDTitle());
    }

}
