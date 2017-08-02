package pl.akademiakodu.kwejk.dao;

import pl.akademiakodu.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Kuczyński on 02.08.2017.
 */
public interface GifDaonInterface {
    List<Gif> findAllGifs();

}
