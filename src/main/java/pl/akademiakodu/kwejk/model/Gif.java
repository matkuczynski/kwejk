package pl.akademiakodu.kwejk.model;

/**
 * Created by Mateusz Kuczyński on 02.08.2017.
 */
public class Gif {

    private String name;

    private Boolean isFavorite;

    public Gif() {
    }

    public Gif(String name, Boolean isFavorite) {
        this.name = name;
        this.isFavorite = isFavorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }
}