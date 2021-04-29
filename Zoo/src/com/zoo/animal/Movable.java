package com.zoo.animal;

import com.zoo.exception.tooOldException;

public interface Movable {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
    void move () throws tooOldException;
    void move(float meters) throws tooOldException;
}
