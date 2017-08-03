package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifDaoImpl implements GifDaoInterface {

    static List<Gif> gifs = new ArrayList<>();
    static {
        gifs.add(new Gif("android-explosion", true, "Most Popular"));
        gifs.add(new Gif("ben-and-mike",  false, "Most Popular"));
        gifs.add(new Gif("book-dominos",  false, "Top Rated"));
        gifs.add(new Gif("compiler-bot",  false, "Top Rated"));
        gifs.add(new Gif("cowboy-coder", true, "New"));
        gifs.add(new Gif("infinite-andrew",  false, "New"));

    }

    @Override
    public List<Gif> findFavoritesGif() {
        List<Gif> gifsFavorite = new ArrayList<>();
        for(int i = 0; i < gifs.size();i++) {
            if (gifs.get(i).getFavorite() == true)
                gifsFavorite.add(gifs.get(i));
        }
        return gifsFavorite;
    }
    @Override
    public List<Gif> findAllGifs() {
        return gifs;
    }

    @Override
    public Gif findByName(String name) {
        Gif result = null;

        for (Gif gifList :gifs){
            if ( gifList.getName().equals(name)){
                result = gifList;
            }
        }
        return result;
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
