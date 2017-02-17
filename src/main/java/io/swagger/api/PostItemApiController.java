package io.swagger.api;

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
public class PostItemApiController implements PostItemApi {

    public ResponseEntity<Void> postItemPost(@ApiParam(value = "item that needs to be added" ,required=true ) @RequestBody Item item) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
