package pl.akademiakodu.kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.kwejk.dao.GifDaoImpl;

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
        return "chosen-gif";  // wyswietlac osobe o odpowiednim id
    }

}
