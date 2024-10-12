package com.ahn.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Instant;
import java.util.Date;

@Controller
public class BasicController {

    private Instant ZomeDateTime;

    @GetMapping("/")
    String hello() {
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "정보글";
    }

    @GetMapping("/date")
    @ResponseBody
    String date() {
        return ZomeDateTime.now().toString();
    }

}
