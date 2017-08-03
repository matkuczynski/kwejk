package pl.akademiakodu.kwejk.dao;


import pl.akademiakodu.kwejk.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDao implements CategoryDaoInterface{

    private static List<Category> categories = new ArrayList();

    static{
        categories.add(new Category("Top Rated", 1L));
        categories.add(new Category("Most Popular", 2L));
        categories.add(new Category("New", 3L));
    }

    public List<Category> showAllCategories(){
        return categories;
    }

    @Override
    public Category getCategory(Long id) {
        if (id==1L){
            return showAllCategories().get(0);
        }
        else if (id==2L){
            return showAllCategories().get(1);
        }
        else
            return showAllCategories().get(2);

    }
}
