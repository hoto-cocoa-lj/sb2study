package jp.slq;

import jp.slq.pojo.Cat;
import jp.slq.pojo.Dog;
import jp.slq.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Arrays;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
        User user = run.getBean(User.class);
        Dog dog = run.getBean(Dog.class);
        //Cat cat = run.getBean(Cat.class);
        String[] users = run.getBeanNamesForType(User.class);
        System.out.println(run.containsBean("component_dog"));
        String[] dogs = run.getBeanNamesForType(Dog.class);
        String[] cats = run.getBeanNamesForType(Cat.class);
        System.out.println(user);
        System.out.println(dog);
        //System.out.println(cat);
        System.out.println(Arrays.toString(users));
        System.out.println(Arrays.toString(dogs));
        System.out.println(Arrays.toString(cats));

    }
}
