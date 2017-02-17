package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Item;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-17T08:29:13.704Z")

@Controller
public class ItemApiController implements ItemApi {

    public ResponseEntity<Item> itemBarcodeGet(@ApiParam(value = "barcode of Item",required=true ) @PathVariable("barcode") String barcode) {

        Item item = new Item();
        item.setBarcode("9788172235635");
        item.setImageUrl("http://mojoimage.com/free-image-hosting-13/2692IMG_20170124_215802.jpg");
        item.setWeight("100");
        return new ResponseEntity<Item>(item,HttpStatus.OK);
    }

}
