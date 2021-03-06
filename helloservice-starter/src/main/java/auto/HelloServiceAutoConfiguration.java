package auto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
//@ConditionalOnMissingBean(HelloService.class)
public class HelloServiceAutoConfiguration {
    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
