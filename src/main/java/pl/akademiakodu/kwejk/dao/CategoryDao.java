package pl.akademiakodu.kwejk.dao;


import pl.akademiakodu.kwejk.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDao implements CategoryDaoInterface{

    private static List<Category> categories = new ArrayList();

    static{
        categories.add(new Category("Top Rated", 1));
        categories.add(new Category("Most Popular", 2));
        categories.add(new Category("New", 3));
    }

    public List<Category> showAllCategories(){
        return categories;
    }
}
