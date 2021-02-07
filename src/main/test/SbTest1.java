import jp.slq.App;
import jp.slq.controller.UserController;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.concurrent.TimeUnit;


@SpringBootTest(classes = App.class)
public class SbTest1 {
    @Autowired
    UserController uc;

    @BeforeAll
    static void ba(){
        System.out.println("BeforeAll----->");
    }
    @AfterAll
    static void aa(){
        System.out.println("<-----AfterAll");
    }

    @BeforeEach
    public void before(){
        System.out.println("BeforeEach----->");
    }

    @AfterEach
    public void after(){
        System.out.println("<-----AfterEach");
    }

    @Test
    @Timeout(value=1,unit= TimeUnit.SECONDS)
    public void t1() throws InterruptedException {
        Thread.sleep(1111);
        System.out.println(uc.select());
    }

    @Test
    @RepeatedTest(2)
    public void t2(){
        System.out.println(uc.select1(49));
    }

    @Test
    @Disabled
    public void t3(){
        System.out.println(uc.select1(52));
    }

    @ParameterizedTest
    //@MethodSource("t5")
    @ValueSource(strings={"apple","banana"})
    public void t4(String s){
        System.out.println(s);
    }

    static String[] t5(){
        String[] s=new String[]{"apple","banana"};
        return  s;
        //return Stream.of("apple","banana");
    }
}
