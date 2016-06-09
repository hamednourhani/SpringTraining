package ir.itstar.Config;

import ir.itstar.CDPlayer.*;
import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by itstar on 2016/06/08.
 */
@Configuration
@ComponentScan(basePackageClasses = CDPlayerInterface.class)
@ImportResource("classpath:ir/itstar/Config/SecoundXmlConfig.xml")
public class CDPLayerConfig {

//    @Bean(name="cdcomp")
//    public CDcompact getCDcompact(){
//        return new FirstCD();
//    }

//    @Bean
//    public CDcompact getSecondCDCompact(){
//        return new SecoundCD("Hamed CD");
//    }

    @Bean(name="cDPlayerInterface")
    public CDPlayerInterface getCDPlayer(CDcompact cd){
        return new CDPlayer(cd);
    }

//    @Bean
//    public CDPlayerInterface getNewCDPLayer(){
//        return new CDPlayer(getCDcompact());
//    }

}
