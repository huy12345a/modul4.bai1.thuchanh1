package com.qlsv.demomodul4_bai1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting() {
        return "index";
    }
}