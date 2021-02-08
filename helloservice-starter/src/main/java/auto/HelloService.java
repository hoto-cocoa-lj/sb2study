package auto;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {
    @Autowired
    HelloProperties hp;
    public String say(String name){
        return hp.getPrefix()+":"+name+":"+hp.getSuffix();
    }
}
