package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifDaoImpl implements GifDaoInterface {

    static List<Gif> gifs = new ArrayList<>();
    static {
        gifs.add(new Gif("android-explosion",  true, "tomek"));
        gifs.add(new Gif("ben-and-mike",  false, "Matylda"));
        gifs.add(new Gif("book-dominos",  false, "Kaczorex"));
        gifs.add(new Gif("compiler-bot",  false, "Ppp99"));
        gifs.add(new Gif("cowboy-coder", true, "Tobi Gobi"));
        gifs.add(new Gif("infinite-andrew",  false, "0907"));
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
}
