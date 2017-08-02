package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Article;

import java.util.List;

/**
 * Created by Mateusz Kuczyński on 02.08.2017.
 */
public interface ArticleDaoInterface {
    List<Article> findAllArticles();
}
