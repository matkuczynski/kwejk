package pl.akademiakodu.kwejk.model;

public class Gif {

    private String name;

    private Boolean isFavorite;

    private String categoryName;

    public Gif() {
    }

    public Gif(String name, Boolean isFavorite, String categoryName) {
        this.name = name;
        this.isFavorite = isFavorite;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
