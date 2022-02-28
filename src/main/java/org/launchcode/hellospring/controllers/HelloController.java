package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by CF
 * Annotations are key
 * This is a request handler
 */
@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    /* Handles request at path /hello */
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    /* this handles requests at path /goodbye */
    @GetMapping("farewell")
    public String farewell()
    {
        return "Farewell, Spring";
    }

//    @GetMapping
//    public String test()
//    {
//        return "This is a test";
//    }
//    Handles request of the form /hello?name=LaunchCode
//    @GetMapping("hello")`//for get ONLY
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, String friend)
    {
        // friend added for 10.4 CYU question
        return "Hello, " + name + " and " + friend + "!";
    }

//    Handles requests of the form /hello/LaunchCode
//    LaunchCode in this instance is now part of the path
//    @GetMapping("hello/{name}") // line 13 makes this redundance - dont need the hello
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

//    @GetMapping("form")
//    public String helloForm()
//    {
//        return "<html>" +
//                "<body>" +
//                "<form action='hello'>" + //submit a request to /hello
//                "<input type='text' name='name'>" +
//                "<input type='submit' value='Greet Me'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    // lives at hello/form
    @GetMapping("form")
    public String helloForm()
    {
        return "<html>" +
                "<body>" +
                "<form action='/hello' method='post'/>" + //submit a request to /hello
                "<input type='text' name='name'/>" +
                "<input type='submit' value='Greet Me'/>" +
                "<input type='text' name='friend'/>" +
                "<input type='submit' value='Friend'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

//    Check Your Understanding Questions 10.2
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
