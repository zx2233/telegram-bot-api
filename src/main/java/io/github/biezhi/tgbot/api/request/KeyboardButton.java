package io.github.biezhi.tgbot.api.request;

import java.io.Serializable;

/**
 * Stas Parshin
 * 06 May 2016
 */
public class KeyboardButton implements Serializable {
    private final static long serialVersionUID = 0L;

    private String text;
    private boolean request_contact;
    private boolean request_location;

    public KeyboardButton(String text) {
        this.text = text;
    }

    public KeyboardButton requestLocation(boolean requestLocation) {
        request_location = requestLocation;
        return this;
    }

    public KeyboardButton requestContact(boolean requestContact) {
        request_contact = requestContact;
        return this;
    }
}
