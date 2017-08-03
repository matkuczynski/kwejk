package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Category;
import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifDaoImpl implements GifDaoInterface {

    static List<Gif> gifs = new ArrayList<>();
    static {
        gifs.add(new Gif("android-explosion", true, "tomek", "Most Popular"));
        gifs.add(new Gif("ben-and-mike",  false, "Matylda", "Most Popular"));
        gifs.add(new Gif("book-dominos",  false, "Kaczorex",  "Top Rated"));
        gifs.add(new Gif("compiler-bot",  false, "Ppp99", "Top Rated"));
        gifs.add(new Gif("cowboy-coder", true, "Tobi Gobi", "New"));
        gifs.add(new Gif("infinite-andrew",  false, "0907", "New"));
    }

    @Override
    public List<Gif> findFavoritesGif() {
        List<Gif> gifsFavorite = new ArrayList<>();
        for(int i = 0; i < gifs.size();i++) {
            if (gifs.get(i).getFavorite())
                gifsFavorite.add(gifs.get(i));
        }
        return gifsFavorite;
    }
    @Override
    public List<Gif> findAllGifs() {
        return gifs;
    }

    @Override
    public List<Gif> findByName(String name) {
        List<Gif> gifsL = new ArrayList<>();

        for (Gif g :gifs){
            if ( g.getName().equals(name)){
                gifsL.add(g);
            }
        }
        return gifsL;
    }

    @Override
    public List<Gif> findTopRated() {
        List<Gif> gifsTopRated = new ArrayList<>();
        for(int i = 0; i < gifs.size();i++) {
            if (gifs.get(i).getCategoryName().equals("Top Rated"))
                gifsTopRated.add(gifs.get(i));
        }
        return gifsTopRated;
    }

    @Override
    public List<Gif> findMostPopular() {
        List<Gif> gifsMostPopular = new ArrayList<>();
        for(int i = 0; i < gifs.size();i++) {
            if (gifs.get(i).getCategoryName().equals("Most Popular"))
                gifsMostPopular.add(gifs.get(i));
        }
        return gifsMostPopular;
    }

    @Override
    public List<Gif> findNew() {
        List<Gif> gifsNew = new ArrayList<>();
        for(int i = 0; i < gifs.size();i++) {
            if (gifs.get(i).getCategoryName().equals("New"))
                gifsNew.add(gifs.get(i));
        }
        return gifsNew;
    }
}
