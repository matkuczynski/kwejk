package pl.akademiakodu.kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.kwejk.dao.GifDaoImpl;

@Controller
public class GifController {

    private GifDaoImpl gifDaoImpl = new GifDaoImpl();

    @GetMapping("/")
    public String allGifs(ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDaoImpl.findAllGifs());
        return "home";
    }
}
