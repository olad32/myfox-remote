package com.pasteque.myfoxremote.events;

/**
 * Created by FAPL01831 on 26/10/2015.
 */
public class AuthenticationEvent {

    private final boolean loggedIn;

    public AuthenticationEvent(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
