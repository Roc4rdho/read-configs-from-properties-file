package xyz.rocard.readconfigfrompropertiesfile.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.rocard.readconfigfrompropertiesfile.services.HomeService;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    HomeService homeService;

    @GetMapping("/greetings")
    public String greetings() {
        return homeService.greetings();
    }
}
