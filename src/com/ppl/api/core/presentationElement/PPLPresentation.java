package com.ppl.api.core.presentationElement;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.InvalidClassException;
import java.util.LinkedList;
import java.util.Queue;

public class PPLPresentation{

    public PPLPresentation()
    {
        children = new LinkedList<>();
    }


    @Override
    public void addChild(PPLPresentationElement child)
    {
        if(child.getClass() != PPLSlide.class){
            try {
                throw new InvalidArgumentException(new String[]{"Cannot add a child of type " + child.getClass() + " to presentation directly"});
            } catch (InvalidArgumentException e) {
                e.printStackTrace();
            }
        }else{
            children.add(child);
        }
    }
}
