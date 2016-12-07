package com.thedeveloperworldisyours.hellorxjava.complex;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Created by javierg on 07/12/2016.
 */

public class UserAndEvents {
    public UserAndEvents(JsonObject user, JsonArray events) {
        this.events = events;
        this.user = user;
    }

    public JsonArray events;
    public JsonObject user;
}