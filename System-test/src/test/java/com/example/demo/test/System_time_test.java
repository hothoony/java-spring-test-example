package com.example.demo.test;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class System_time_test {

    @Test
    void test1() {
        System.out.println("1. " + (new Date()).getTime());
        System.out.println("2. " + System.currentTimeMillis());
        System.out.println("3. " + Instant.now().getEpochSecond());
        System.out.println("4. " + Instant.now().toEpochMilli());
        System.out.println("5. " + System.nanoTime());
        System.out.println("6. " + LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond());
        System.out.println("7. " + LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }

    @Test
    void loop_test() {
        for (int i = 0; i < 10; i++) {
//            System.out.println("1. " + (new Date()).getTime()); // 중복 있음
//            System.out.println("2. " + System.currentTimeMillis()); // 중복 있음
//            System.out.println("3. " + Instant.now().getEpochSecond()); // 중복 있음
//            System.out.println("4. " + Instant.now().toEpochMilli()); // 중복 있음
            System.out.println("5. " + System.nanoTime()); // 중복 없음 => O
//            System.out.println("6. " + LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond()); // 중복 있음
//            System.out.println("7. " + LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()); // 중복 있음
        }
    }
}
