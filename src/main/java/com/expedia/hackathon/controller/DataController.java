package com.expedia.hackathon.controller;

import com.expedia.hackathon.entity.MessageObject;
import com.expedia.hackathon.service.DataHaandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Bhavi on 14-11-2016.
 */
@RestController
@RequestMapping("/springbootApplication/saveDetails")
public class DataController {

    @Autowired
    private DataHaandlerService dataHaandlerService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<MessageObject> getAllObjects () {
        return dataHaandlerService.getAllObjects();
    }


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String SaveData(@RequestBody MessageObject messageObject) {
        return "Data Stored";
    }

}
