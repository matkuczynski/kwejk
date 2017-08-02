package pl.akademiakodu.kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemeController {

    @GetMapping("/")
    public String allMemes(ModelMap modelMap){
        return "home";
    }
}
