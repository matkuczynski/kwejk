package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Kuczyński on 02.08.2017.
 */
public class ArticleDaoImpl implements ArticleDaoInterface {
    static List<Article> articles = new ArrayList<>();
    static {
        articles.add(new Article("artykuł1", "fajny artykuł"));
        articles.add(new Article("artykuł2", "nudny artykuł"));
        articles.add(new Article("artykuł3", "długi artykuł"));
        articles.add(new Article("artykuł4", "krótki artykuł"));
        articles.add(new Article("artykuł5", "ciekawy artykuł"));
    }

    @Override
    public List<Article> findAllArticles() {
        return articles;
    }
}
