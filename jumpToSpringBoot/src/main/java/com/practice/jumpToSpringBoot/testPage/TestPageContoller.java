package com.practice.jumpToSpringBoot.testPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestPageContoller {
    @GetMapping("/test")
    @ResponseBody
    public String showPage(){
        return "Well done";
    }
}
