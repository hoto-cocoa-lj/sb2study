package jp.slq;

import jp.slq.pojo.Cat;
import jp.slq.pojo.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Cat.class)
@EnableConfigurationProperties(Cat.class)
public class AppConf {
    @Bean
    User user1(){
//        User user1 = new User("User1", 11, null);
        User user1 = new User();
        user1.setName("user1");
        user1.setAge(11);
        return user1;
    }
}
