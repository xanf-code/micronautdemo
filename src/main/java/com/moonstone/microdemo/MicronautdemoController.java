package com.moonstone.microdemo;

import io.micronaut.http.annotation.*;

@Controller("/micronautdemo")
public class MicronautdemoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}