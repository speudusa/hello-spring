package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by CF
 * Annotations are key
 * This is a request handler
 */
@Controller
public class HelloController {

    /* Handles request at path /hello */
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    /* this handles requests at path /goodbye */
    @GetMapping("farewell")
    @ResponseBody
    public String farewell()
    {
        return "Farewell, Spring";
    }

    @GetMapping
    @ResponseBody
    public String test()
    {
        return "This is a test";
    }
//    Handles request of the form /hello?name=LaunchCode
    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name)
    {
        return "Hello, " + name + "!";
    }

//    Handles requests of the form /hello/LaunchCode
//    LaunchCode in this instance is now part of the path

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

//    Check Your Understanding Questions
//    @GetMapping("venus")
//    @ResponseBody
//    public String venusSurface(@RequestParam String terrestrial) {
//        if (terrestrial == "true") {
//            return "Venus is rocky.";
//        } else {
//            return "Venus is gaseous.";
//        }
//    }
//
//    @GetMapping("venus/{orbiter}")
//    @ResponseBody
//    public String venusOrbiter(@PathVariable String orbiter) {
//        return orbiter + " currently orbits Venus.";
//    }
}
