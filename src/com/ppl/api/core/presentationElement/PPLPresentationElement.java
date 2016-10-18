package com.ppl.api.core.presentationElement;

import com.ppl.api.core.content.PPLContent;
import javafx.scene.Node;

import java.util.Queue;

public abstract class PPLPresentationElement {
    double x, y;
    PPLContent content;
    Queue<PPLPresentationElement> children;
    Class guiElement;

    public abstract void addChild(PPLPresentationElement child);
}
