package com.springboot_mybatis.global.rq;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class Rq {
    @Getter
    private int count;

    public int increaseCount() {
        return count++;
    }
}
