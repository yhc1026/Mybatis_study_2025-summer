package com.spring.mybatis.Utils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class idGenerator {
    public static int generateRandomId() {
        return ThreadLocalRandom.current().nextInt(1, 1_000_001);
    }
}
