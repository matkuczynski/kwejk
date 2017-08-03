package pl.akademiakodu.kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.kwejk.dao.GifDaoImpl;
import pl.akademiakodu.kwejk.model.Gif;

@Controller
public class GifController {

    private GifDaoImpl gifDaoImpl = new GifDaoImpl();

    @GetMapping("/favorites")
    public String gifsList(ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDaoImpl.findFavoritesGif());
        return "favorites";
    }

    @GetMapping("/")
    public String allGifs(ModelMap modelMap){
        modelMap.addAttribute("gifs", gifDaoImpl.findAllGifs());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String display(@PathVariable String name, ModelMap modelMap ){    //@PathVariable - odnosi sie bezposrednio do id url
        modelMap.addAttribute("gifs", gifDaoImpl.findByName(name));
        return "home";
    }

    @GetMapping("/gifs/search")
    public String search(@RequestParam String gifName, ModelMap modelMap) {
        modelMap.addAttribute("gifs", gifDaoImpl.findByName(gifName));
        return "home";
    }
}
