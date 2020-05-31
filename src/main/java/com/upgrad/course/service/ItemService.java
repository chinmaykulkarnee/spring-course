package com.upgrad.course.service;

import com.upgrad.course.entity.Item;
import com.upgrad.course.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Transactional
    public void add(Item item) {
        itemRepository.save(item);
    }

    @Transactional
    public List<Item> listAll() {
        return itemRepository.findAll();
    }

    @Transactional
    public List<Item> getDetails(String name) {
        return itemRepository.findByName(name);
    }

    @Transactional
    public void deleteAll() {
        itemRepository.deleteAll();
    }
}
