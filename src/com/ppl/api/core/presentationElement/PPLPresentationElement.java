package com.ppl.api.core.presentationElement;

import com.ppl.api.core.content.PPLContent;
import javafx.scene.Node;

import java.util.Queue;

public abstract class PPLPresentationElement {
    double x, y;
    PPLContent content;
    Queue<PPLPresentationElement> children;
    Node guiElement;

    public abstract void addChild(PPLPresentationElement child);

    public Node getGuiElement()
    {
        return guiElement;
    }
}
