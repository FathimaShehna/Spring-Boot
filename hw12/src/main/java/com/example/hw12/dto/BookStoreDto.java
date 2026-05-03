package com.example.hw12.dto;

public class BookStoreDto {

	private Long id;
	   
    private String title;
    private String author;
    private String genre;
    private float price;
    private String publishedDate;
    
    public BookStoreDto(String title,String author,float price,String genre,String publishedDate) {
    	super();
    	this.title=title;
        this.author=author;
        this.price=price;
        this.genre=genre;
        this.publishedDate=publishedDate;
        
    }
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	
}