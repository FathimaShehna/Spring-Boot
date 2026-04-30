package com.example.lab12.dto;

public class ProductsDto {

	private Long id;
	   
    private String name;
    private String description;
    private float price;
    private String expiryDate;
    private String category;
    private String stock;
    
    public ProductsDto(String name,String description,float price,String expiryDate,String category,String stock) {
    	super();
    	this.name = name;
        this.description=description;
        this.price=price;
        this.expiryDate=expiryDate;
        this.category=category;
        this.stock=stock;
        
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
	
	
}