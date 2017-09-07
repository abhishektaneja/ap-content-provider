package com.ap.content.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GetResourceController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index() {
        return "Greetings!";
    }

    @RequestMapping("/content/{appIdentifier}/{dataKey}")
    public String getResourceData(@PathVariable("appIdentifier") String appIdentifier, @PathVariable("dataKey") String dataKey) {
        log.info("got request");
        return "Greetings!" + dataKey + " " + appIdentifier;
    }

}

