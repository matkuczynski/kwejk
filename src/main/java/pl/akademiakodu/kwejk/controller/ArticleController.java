package pl.akademiakodu.kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.kwejk.dao.ArticleDaoImpl;

@Controller
public class ArticleController {

    private ArticleDaoImpl articleDaoIml = new ArticleDaoImpl();

    @GetMapping("/articles")
    public String articleTable(ModelMap modelMap){
        modelMap.addAttribute("articles", articleDaoIml.findAllArticles());
        return "articles";
    }
}
