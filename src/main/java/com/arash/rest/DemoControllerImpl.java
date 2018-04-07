package com.arash.rest;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anton1113 on 07.04.18.
 */
@RestController
public class DemoControllerImpl implements DemoController {

    @Override
    public String hello() {
        return "Hello, world!";
    }
}
