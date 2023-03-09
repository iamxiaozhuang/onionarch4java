package pers.xiaozhuang.onionarch.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pers.xiaozhuang.onionarch")
public class OnionarchApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnionarchApplication.class, args);
    }

}