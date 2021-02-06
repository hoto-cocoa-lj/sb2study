package jp.slq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Integer id;
    String name;
    Integer age;
    @Autowired
    Dog dog;
}
