package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Category;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.List;

/**
 * Created by Mateusz Kuczyński on 03.08.2017.
 */
public interface CategoryDaoInterface {

    List<Category> showAllCategories();
    Category getCategory(Long id);
}
