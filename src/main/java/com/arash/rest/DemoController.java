package com.arash.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by anton1113 on 07.04.18.
 */
public interface DemoController {

    @RequestMapping(value = "/rest/hello", method = RequestMethod.GET)
    String hello();
}
