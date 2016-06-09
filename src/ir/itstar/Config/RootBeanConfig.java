package ir.itstar.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by itstar on 2016/06/09.
 */
@Configuration
@ComponentScan(basePackageClasses = {ir.itstar.CDPlayer.CDPlayerInterface.class})
@Import(CDPLayerConfig.class)
@ImportResource(
        {
            "classpath:ir/itstar/Config/SecoundXmlConfig.xml",
            "classpath:ir/itstar/Config/CDConfiguration.xml"
        }
)
public class RootBeanConfig {

}
