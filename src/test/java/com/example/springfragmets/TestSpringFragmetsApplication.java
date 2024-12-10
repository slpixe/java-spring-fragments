package com.example.springfragmets;

import org.springframework.boot.SpringApplication;

public class TestSpringFragmetsApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringFragmetsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
