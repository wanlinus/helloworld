package cn.wanlinus.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloworldApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

    @Override
    public void run(String... strings) {
//        Map<String, String> envs = System.getenv();
//        envs.keySet().forEach(s -> LOGGER.info("env: {}-{}", s, envs.get(s)));
    }
}
