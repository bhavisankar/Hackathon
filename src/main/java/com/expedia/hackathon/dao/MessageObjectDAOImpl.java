package com.expedia.hackathon.dao;

import com.expedia.hackathon.entity.MessageObject;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bhavi on 14-11-2016.
 */
@Repository
public class MessageObjectDAOImpl implements MessageObjectDAO {

    private static Map<Integer, MessageObject> messageObjectMap;

    static {
        messageObjectMap = new HashMap<Integer, MessageObject>(){
            {
                put(1 , new MessageObject("1", "username1", "key1"));
                put(2 , new MessageObject("2", "username2", "key2"));
                put(3 , new MessageObject("3", "username3", "key3"));
                put(4 , new MessageObject("4", "username4", "key4"));
                put(1 , new MessageObject("5", "username5", "key5"));
            }
        };
    }

    @Override
    public Collection<MessageObject> getAllObjects() {
        return this.messageObjectMap.values();
    }
}
