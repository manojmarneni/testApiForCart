package io.swagger.api;

import io.swagger.business.ItemProcess;
import io.swagger.model.Item;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-17T08:29:13.704Z")

@Controller
@CrossOrigin(origins = "*")
public class PostItemApiController implements PostItemApi {

    @Autowired
    ItemProcess itemProcess;

    public ResponseEntity<Void> postItemPost(@ApiParam(value = "item that needs to be added" ,required=true ) @RequestBody Item item) {
        // do some magic!

        itemProcess.postItem(item);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
