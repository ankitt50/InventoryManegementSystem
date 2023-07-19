package com.mobileprogramming.com.springbootrestproject.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
	private String itemName;
	private String itemEnteredByUser;
	private Timestamp itemEnteredDate;
	private double itemBuyingPrice;
	private double itemSellingPrice;
	private Timestamp itemLastModifiedDate;
	private String itemLastModifiedByUser;
	private ItemStatus itemStatus;

}
