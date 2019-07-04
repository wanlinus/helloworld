package cn.wanlinus.helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class HelloworldApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void asd() {
        Map<String, String> getenv = System.getenv();
        getenv.keySet().forEach(s -> {
            System.out.println(s + " : " + getenv.get(s));
        });
    }

}
