package pl.akademiakodu.kwejk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Mateusz Kuczyński on 01.08.2017.
 */
@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "index";
    }
}
