package com.ppl.api.core.presentationElement;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.InvalidClassException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PPLPresentation{

    private Queue<PPLSlide> slideQueue;

    public PPLPresentation()
    {
        slideQueue = new LinkedList<>();
    }

    public void addSlide(PPLSlide slide)
    {
        slideQueue.add(slide);
    }
}

