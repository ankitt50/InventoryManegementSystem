package com.mobileprogramming.com.springbootrestproject.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileprogramming.com.springbootrestproject.entity.Item;
import com.mobileprogramming.com.springbootrestproject.entity.ItemStatus;
import com.mobileprogramming.com.springbootrestproject.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}
	
	public Item getItemById(int itemId) {
		return itemRepository.findById(itemId).orElse(null);
	}
	
	public List<Item> getItemByStatusAndEnteredByUser(ItemStatus itemStatus, String itemEnteredByUser) {
		return itemRepository.findByItemStatusAndItemEnteredByUser(itemStatus, itemEnteredByUser);
		
	}
	
	public Item saveItem(Item item) {
		item.setItemEnteredDate(Timestamp.valueOf(LocalDateTime.now()));
		item.setItemLastModifiedDate(Timestamp.valueOf(LocalDateTime.now()));
		return itemRepository.save(item);
	}
	
	public void updateItem(Item item) {
		//item.getItemId();
		Item existingItem = itemRepository.findById(item.getItemId()).orElse(null);
		existingItem.setItemBuyingPrice(item.getItemBuyingPrice());
		existingItem.setItemEnteredByUser(item.getItemEnteredByUser());
		existingItem.setItemEnteredDate(item.getItemEnteredDate());
		existingItem.setItemLastModifiedByUser(item.getItemLastModifiedByUser());
		existingItem.setItemLastModifiedDate(Timestamp.valueOf(LocalDateTime.now()));
		existingItem.setItemName(item.getItemName());
		existingItem.setItemSellingPrice(item.getItemSellingPrice());
		existingItem.setItemStatus(item.getItemStatus());
		itemRepository.save(existingItem);
		
	}
	
	public void deleteItem(int itemId) {
		 itemRepository.deleteById(itemId);
	}

	public void deleteAllItem() {
		itemRepository.deleteAll();
		
	}
	
	

}
