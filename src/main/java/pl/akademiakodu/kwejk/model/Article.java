package pl.akademiakodu.kwejk.model;

/**
 * Created by Mateusz Kuczyński on 02.08.2017.
 */
public class Article {
    private String title;
    private String description;

    public Article(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
