package com.mobileprogramming.com.springbootrestproject.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobileprogramming.com.springbootrestproject.entity.Item;
import com.mobileprogramming.com.springbootrestproject.entity.ItemStatus;
import com.mobileprogramming.com.springbootrestproject.service.ItemService;

@RestController
@RequestMapping("/app/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
//	@GetMapping
//	public List<Item> getAllItems() {
//		return itemService.getAllItems();
//	}
	
	@GetMapping("/{itemId}")
	public Item getItemById(@PathVariable int itemId) {
		return itemService.getItemById(itemId);
	}
	
	@GetMapping
	public List<Item> getItemByStatus(@RequestParam(required = false) ItemStatus itemStatus, @RequestParam(required = false) String itemEnteredByUser) {
		if(itemStatus == null || itemEnteredByUser == null) {
			itemService.getAllItems();
		}
		return itemService.getItemByStatusAndEnteredByUser(itemStatus, itemEnteredByUser);	
	}
	
	@PostMapping
	public Item saveItem(@RequestBody Item item) {
		return itemService.saveItem(item);
	}
	
	
	@PutMapping
	public void updateItem(Item item) {
		itemService.updateItem(item);
	}
	
	@DeleteMapping("/{itemId}")
	public void deleteItem(@PathVariable int itemId) {
		 itemService.deleteItem(itemId);
	}
	
	@DeleteMapping
	public void deleteAllItem() {
		 itemService.deleteAllItem();
	}
}
