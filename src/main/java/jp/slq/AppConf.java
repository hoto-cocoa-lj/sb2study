package jp.slq;

import jp.slq.interceptor.MyInterceptor;
import jp.slq.pojo.Cat;
import jp.slq.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Import(Cat.class)
@EnableConfigurationProperties(Cat.class)
public class AppConf implements WebMvcConfigurer {
    @Autowired
    MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/leaf1","/","/st/**");
    }

    @Bean
    User user1(){
        User user1 = new User();
        user1.setName("user1");
        user1.setAge(11);
        return user1;
    }
}
