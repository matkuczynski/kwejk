package pl.akademiakodu.kwejk.model;

public class Gif {

    private String name;

    private Boolean isFavorite;

    private String username;

    public Gif() {
    }

    public Gif(String name, Boolean isFavorite) {
        this.name = name;
        this.isFavorite = isFavorite;
    }

    public Gif(String name, Boolean isFavorite, String username) {
        this.name = name;
        this.isFavorite = isFavorite;
        this.username = username;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
