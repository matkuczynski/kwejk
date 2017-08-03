package pl.akademiakodu.kwejk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.kwejk.dao.CategoryDao;
import pl.akademiakodu.kwejk.dao.GifDaoImpl;

@Controller
public class CategoryController {

    private CategoryDao categoryDao = new CategoryDao();
    private GifDaoImpl gifDaoImpl = new GifDaoImpl();

    @GetMapping("/categories")
    public String categoryList(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryDao.showAllCategories());
        return "categories";
    }

    @GetMapping("/category/1")
    public String categoryTopRated(ModelMap modelMap) {
        modelMap.addAttribute("category", categoryDao.showAllCategories().get(0));
        modelMap.addAttribute("gifs", gifDaoImpl.findTopRated());
        return "category";
    }

    @GetMapping("/category/2")
    public String categoryMostPopular(ModelMap modelMap) {
        modelMap.addAttribute("category", categoryDao.showAllCategories().get(1));
        modelMap.addAttribute("gifs", gifDaoImpl.findMostPopular());
        return "category";
    }

    @GetMapping("/category/3")
    public String categoryNew(ModelMap modelMap) {
        modelMap.addAttribute("category", categoryDao.showAllCategories().get(2));
        modelMap.addAttribute("gifs", gifDaoImpl.findNew());
        return "category";
    }
}
