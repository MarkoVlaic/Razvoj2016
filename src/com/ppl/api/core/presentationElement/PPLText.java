package com.ppl.api.core.presentationElement;

import com.ppl.api.core.content.PPLTextContent;
import javafx.scene.control.Label;

public class PPLText extends PPLPresentationElement{

    public PPLText()
    {
        this.content = new PPLTextContent();
        this.guiElement = Label.class;
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
