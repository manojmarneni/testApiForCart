package io.swagger.business;

import io.swagger.api.ResourceNotFoundException;
import io.swagger.model.Item;
import io.swagger.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z002954 on 2/18/17.
 */
@Component
public class ItemProcess {


    @Autowired
    ItemRepository itemRepository;



    public void postItem(Item item) {

        try {
            itemRepository.save(item);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Item getItemByBarcode(String barcode) {
        List<Item> itemList = new ArrayList<>();
        try {
            itemList = itemRepository.findByBarcode(barcode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(itemList.isEmpty()){
            throw new ResourceNotFoundException("Item with barcode " + barcode + " doesn't exist in our database");
        }
        return itemList.get(0);
    }
}
