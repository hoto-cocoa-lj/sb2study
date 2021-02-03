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
        //Cat cat = run.getBean(Cat.class);                            //报错有两个猫
        String[] users = run.getBeanNamesForType(User.class);
        System.out.println(run.containsBean("component_dog"));      //true
        String[] dogs = run.getBeanNamesForType(Dog.class);
        String[] cats = run.getBeanNamesForType(Cat.class);
        System.out.println(user);       //User(name=user1, age=11, dog=Dog(nickname=reddog))
        System.out.println(dog);        //Dog(nickname=reddog)
        //System.out.println(cat);
        System.out.println(Arrays.toString(users));     //[user1]
        System.out.println(Arrays.toString(dogs));      //[component_dog]
        System.out.println(Arrays.toString(cats));      //[jp.slq.pojo.Cat, cat-jp.slq.pojo.Cat]



    }
}
