package com.expedia.hackathon.dao;

import com.expedia.hackathon.entity.MessageObject;

import java.util.Collection;

/**
 * Created by Bhavi on 14-11-2016.
 */
public interface MessageObjectDAO {
    Collection<MessageObject> getAllObjects();
}
