package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Kuczyński on 02.08.2017.
 */
public class GifDaoImpl implements GifDaonInterface{

    static List<Gif> gifs = new ArrayList<>();
    static {
        gifs.add(new Gif("android-explosion", true));
        gifs.add(new Gif("ben-and-mike", false));
        gifs.add(new Gif("book-dominos", false));
        gifs.add(new Gif("compiler-bot", false));
        gifs.add(new Gif("cowboy-coder", true));
        gifs.add(new Gif("infinite-andrew", false));

    }

    @Override
    public List<Gif> findAllGifs() {
        return gifs;
    }
}
