package com.ppl.api.core.presentationElement;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.InvalidClassException;
import java.util.LinkedList;

public class PPLSlide {

    public PPLSlide()
    {
        children = new LinkedList<>();
    }

    @Override
    public void addChild(PPLPresentationElement child)
    {
        if(child.getClass() == PPLSlide.class || child.getClass() == PPLPresentation.class){
            try {
                throw new InvalidArgumentException(new String[]{"Cannot add a child of type " + child.getClass() + " to slide directly"});
            } catch (InvalidArgumentException e) {
                e.printStackTrace();
            }
        }else{
            children.add(child);
        }
    }
}
