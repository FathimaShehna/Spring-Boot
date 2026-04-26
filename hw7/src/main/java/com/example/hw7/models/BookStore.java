package com.example.hw7.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity 
public class BookStore {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer id;
    private String title;
    private String authorName;
    private Float price;
	
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public Float getPrice() {
        return price;
    }	
    public void setPrice(Float price) {
        this.price = price;
    }
}