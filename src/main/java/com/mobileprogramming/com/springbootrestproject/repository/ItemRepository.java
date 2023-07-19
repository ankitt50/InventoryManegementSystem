package com.mobileprogramming.com.springbootrestproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileprogramming.com.springbootrestproject.entity.Item;
import com.mobileprogramming.com.springbootrestproject.entity.ItemStatus;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {


	List<Item> findByItemStatusAndItemEnteredByUser(ItemStatus itemStatus, String itemEnteredByUser);

}
