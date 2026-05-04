package com.example.hw13.dto;

public class UserDto {

	private Long id;
	   
	private String firstName;
    private String lastName;
    private Integer mobileNo;
    private String email;
    private String password;
    private String goals;
    
    public UserDto(String firstName,String lastName,Integer mobileNo,String email,String password,String goals) {
    	super();
    	this.firstName=firstName;
        this.lastName=lastName;
        this.mobileNo=mobileNo;
        this.email=email;
        this.password=password;
        this.goals=goals;
        
    }
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}
	
}