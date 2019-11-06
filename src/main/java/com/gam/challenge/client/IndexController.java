package com.gam.challenge.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/sorting-app")
    public String index() {
        return "client";
    }
}
