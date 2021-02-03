package jp.slq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component("component_dog")
@AllArgsConstructor
@NoArgsConstructor
//@ConditionalOnMissingBean(name={"jp.slq.pojo.Cat"})
@ConfigurationProperties(prefix="dog")
public class Dog {
    String nickname;
}
