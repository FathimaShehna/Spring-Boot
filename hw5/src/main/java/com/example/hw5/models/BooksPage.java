package com.example.hw5.models;


public class BooksPage {
	
	private String title;
	private String author;
	private float price;
	
	public BooksPage (String title,String author,float price) {
		
		this.title = title;
		this.author =author;
		this.price = price;
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
		
		public float getPrice() {
			return price;
		}
		
		public void setPrice(float price) {
			this.price = price;
		}
		
		
		
	
}