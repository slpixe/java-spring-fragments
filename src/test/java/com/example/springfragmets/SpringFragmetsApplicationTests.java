package com.example.springfragmets;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringFragmetsApplicationTests {

    @Test
    void contextLoads() {
    }

}
