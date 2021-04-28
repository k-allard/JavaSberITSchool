package com.zoo.animal;

import com.zoo.exception.tooOldException;

public interface Movable {
    void move () throws tooOldException;
    void move(float meters) throws tooOldException;
}
