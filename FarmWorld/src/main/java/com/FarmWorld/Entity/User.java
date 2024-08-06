package com.FarmWorld.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int userId;
	private String userName;
	private String userMobileNumber;
	private String userEmail;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private UserAddress userAddress;
//    @Column
//    @ElementCollection(targetClass=String.class)
//	private List<String> produceableProducts;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, String userMobileNumber, String userEmail, UserAddress userAddress
			) {
		super();
		this.userName = userName;
		this.userMobileNumber = userMobileNumber;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
//		this.produceableProducts = produceableProducts;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public UserAddress getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}

//	public List<String> getProduceableProducts() {
//		return produceableProducts;
//	}
//
//	public void setProduceableProducts(List<String> produceableProducts) {
//		this.produceableProducts = produceableProducts;
//	}

	

}
