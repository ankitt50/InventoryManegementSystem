package com.mobileprogramming.com.springbootrestproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobileprogramming.com.springbootrestproject.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
