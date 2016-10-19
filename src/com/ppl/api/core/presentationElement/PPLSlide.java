package com.ppl.api.core.presentationElement;

import com.sun.javaws.exceptions.InvalidArgumentException;
import javafx.scene.Group;
import jdk.nashorn.internal.runtime.ECMAException;

import java.io.InvalidClassException;
import java.util.LinkedList;

public class PPLSlide extends PPLPresentationElement{

    private Group layout;

    public PPLSlide()
    {
        children = new LinkedList<>();
        layout = new Group();
    }

    @Override
    public void addChild(PPLPresentationElement child)
    {
        if(child.getClass() == PPLSlide.class){
            try {
                throw new Exception("PPLSlide cannot be a child of a PPLSlide class");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            children.add(child);
            layout.getChildren().add(child.getGuiElement());
        }
    }

    public Group getLayout()
    {
        return layout;
    }
}
