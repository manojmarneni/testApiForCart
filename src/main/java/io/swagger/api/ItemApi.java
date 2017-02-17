package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Item;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-17T08:29:13.704Z")

@Api(value = "Item", description = "the Item API")
public interface ItemApi {

    @ApiOperation(value = "", notes = "", response = Item.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Item.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Item.class) })
    @RequestMapping(value = "/Item/{barcode}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Item> itemBarcodeGet(@ApiParam(value = "barcode of Item", required = true) @PathVariable("barcode") String barcode);

}
