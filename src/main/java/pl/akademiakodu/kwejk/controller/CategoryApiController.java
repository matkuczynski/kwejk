package pl.akademiakodu.kwejk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.kwejk.dao.CategoryDao;
import pl.akademiakodu.kwejk.model.Category;

import java.util.List;

@RestController
public class CategoryApiController {
    @GetMapping("/api/categories")
    public List<Category> listCategories(){
        CategoryDao categoryDao = new CategoryDao();
        return categoryDao.showAllCategories();
    }
}
