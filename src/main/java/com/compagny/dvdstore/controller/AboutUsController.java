package com.compagny.dvdstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutUsController {

    @RequestMapping("/about-us")
    public String displayFullDetails(){

        System.out.println("Tentative de l'a ffichage de l'a propos");

        return "index";
    }
}
