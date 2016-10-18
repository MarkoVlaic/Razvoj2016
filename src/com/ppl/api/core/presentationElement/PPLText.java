package com.ppl.api.core.presentationElement;

import javafx.scene.control.Label;

public class PPLText extends PPLPresentationElement{

    public PPLText()
    {

    }

    @Override
    public void addChild(PPLPresentationElement child)
    {
        try {
            throw new Exception("Cannot add child to a text element");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
