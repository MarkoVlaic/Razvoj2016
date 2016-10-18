package com.ppl.api.core.presentationElement;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.InvalidClassException;
import java.util.LinkedList;

public class PPLSlide extends PPLPresentationElement {

    public PPLSlide()
    {
        children = new LinkedList<>();
    }

    @Override
    public void addChild(PPLPresentationElement child)
    {
        if(child.getClass() == PPLSlide.class){
            try {
                e.printStackTrace();
            }
        }else{
            children.add(child);
        }
    }
}
