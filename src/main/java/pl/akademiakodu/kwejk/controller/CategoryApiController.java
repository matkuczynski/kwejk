package pl.akademiakodu.kwejk.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.kwejk.dao.CategoryDao;
import pl.akademiakodu.kwejk.dao.GifDaoImpl;
import pl.akademiakodu.kwejk.model.Category;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.List;

@RestController
public class CategoryApiController {

    private GifDaoImpl gifDaoImpl = new GifDaoImpl();

    @GetMapping("/api/categories")
    public List<Category> listCategories(){
        CategoryDao categoryDao = new CategoryDao();
        return categoryDao.showAllCategories();
    }

    @GetMapping("/api/{name}")
    public List<Gif> apiGifDetails(@PathVariable String name){
        return gifDaoImpl.findByName(name);
    }

    @GetMapping("/api/categories/{id}")
    public Category category(@PathVariable Long id){
        CategoryDao categoryDao = new CategoryDao();
        return categoryDao.getCategory(id);
    }
}
