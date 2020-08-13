package com.dxctraining.ui;

import com.dxctraining.entities.Item;
import com.dxctraining.exceptions.ItemNotFoundException;
import com.dxctraining.exceptions.InvalidArgumentException;
import com.dxctraining.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ItemUi {
    @Autowired
    private IItemService service;


    @PostConstruct
    public void runUi(){
        try {
            Item item1 = new Item("anshul/n");
            Item item2 = new Item("ayushi/n");
            Item item3 = new Item("anuj/n");
            item1 = service.save(item1);
            item2 = service.save(item2);
            item3 = service.save(item3);
            item3=service.save(item3);
            int id1 = item1.getId();
            int id2 = item2.getId();
            int id3 = item3.getId();
            Item fetched1 = service.findItemById(id1);
            Item fetched2= service.findItemById(id2);
            Item fetched3= service.findItemById(id3);
            System.out.println("fetched item name =" + fetched1.getName());
            System.out.println("fetched item name =" + fetched2.getName());
            System.out.println("fetched item name =" + fetched3.getName());
        }catch (ItemNotFoundException e){
            e.printStackTrace();
        }

        catch (InvalidArgumentException e){
            e.printStackTrace();
        }
    }



}
