package com.arash.rest

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by anton1113 on 07.04.18.
 */
@RestController
class GDemoController {

    @RequestMapping(method = RequestMethod.GET, value = "rest/groovy/hello")
    def hello() {
        'Hello, world!'
    }
}
