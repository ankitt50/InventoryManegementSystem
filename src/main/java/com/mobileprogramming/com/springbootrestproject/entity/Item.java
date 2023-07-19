package com.mobileprogramming.com.springbootrestproject.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Item")
public class Item {
	
	@Id
	@GeneratedValue
	private int itemId;
	private String itemName;
	private String itemEnteredByUser;
	private Timestamp itemEnteredDate;
	private double itemBuyingPrice;
	private double itemSellingPrice;
	private Timestamp itemLastModifiedDate;
	private String itemLastModifiedByUser;
	private ItemStatus itemStatus;
	public int getItemId() {
		return itemId;
	}
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemEnteredByUser() {
		return itemEnteredByUser;
	}
	public void setItemEnteredByUser(String itemEnteredByUser) {
		this.itemEnteredByUser = itemEnteredByUser;
	}
	public Timestamp getItemEnteredDate() {
		return itemEnteredDate;
	}
	public void setItemEnteredDate(Timestamp itemEnteredDate) {
		this.itemEnteredDate = itemEnteredDate;
	}
	public double getItemBuyingPrice() {
		return itemBuyingPrice;
	}
	public void setItemBuyingPrice(double itemBuyingPrice) {
		this.itemBuyingPrice = itemBuyingPrice;
	}
	public double getItemSellingPrice() {
		return itemSellingPrice;
	}
	public void setItemSellingPrice(double itemSellingPrice) {
		this.itemSellingPrice = itemSellingPrice;
	}
	public Timestamp getItemLastModifiedDate() {
		return itemLastModifiedDate;
	}
	public void setItemLastModifiedDate(Timestamp itemLastModifiedDate) {
		this.itemLastModifiedDate = itemLastModifiedDate;
	}
	public String getItemLastModifiedByUser() {
		return itemLastModifiedByUser;
	}
	public void setItemLastModifiedByUser(String itemLastModifiedByUser) {
		this.itemLastModifiedByUser = itemLastModifiedByUser;
	}
	public ItemStatus getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(ItemStatus itemStatus) {
		this.itemStatus = itemStatus;
	}

	
	
}
