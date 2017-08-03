package pl.akademiakodu.kwejk.model;

public class Gif {

    private String name;

    private Boolean isFavorite;

    private String username;

    private String categoryName;

    public Gif() {
    }

    public Gif(String name, Boolean isFavorite, String username, String categoryName) {
        this.name = name;
        this.isFavorite = isFavorite;
        this.username = username;
        this.categoryName = categoryName;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
