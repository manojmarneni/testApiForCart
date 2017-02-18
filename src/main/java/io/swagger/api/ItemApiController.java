package io.swagger.api;

import io.swagger.business.ItemProcess;
import io.swagger.model.Error;
import io.swagger.model.Item;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-17T08:29:13.704Z")

@Controller
@CrossOrigin(origins = "*")
public class ItemApiController implements ItemApi {

    @Autowired
    ItemProcess itemProcess;


    public ResponseEntity<Item> itemBarcodeGet(@ApiParam(value = "barcode of Item",required=true ) @PathVariable("barcode") String barcode) {


        Item item = new Item();
        item =  itemProcess.getItemByBarcode(barcode);

        return new ResponseEntity<Item>(item,HttpStatus.OK);
    }

}
