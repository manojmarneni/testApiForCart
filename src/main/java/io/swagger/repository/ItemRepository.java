package io.swagger.repository;

import io.swagger.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by z002954 on 2/18/17.
 */
public interface ItemRepository extends CrudRepository<Item, Integer> {

    List<Item> findByBarcode(String barcode);
}
