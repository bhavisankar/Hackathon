package com.expedia.hackathon.service;

import com.expedia.hackathon.dao.MessageObjectDAOImpl;
import com.expedia.hackathon.entity.MessageObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Bhavi on 14-11-2016.
 */
@Service
public class DataHaandlerService {
    @Autowired
    private MessageObjectDAOImpl messageObjectDAOImpl;

    public Collection<MessageObject> getAllObjects () {
        return messageObjectDAOImpl.getAllObjects();
    }
}
