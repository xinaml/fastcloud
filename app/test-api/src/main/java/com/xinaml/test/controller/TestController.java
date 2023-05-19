package com.xinaml.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liguiqin
 * @date 2023/5/15
 */
@RestController
public class TestController {

    @GetMapping("getTest")
    public List<Object> getTest() {
        List<Object> list = new ArrayList<>();
        list.add("testApi");
        return list;
    }
}
