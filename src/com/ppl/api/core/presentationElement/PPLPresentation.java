package com.ppl.api.core.presentationElement;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;

import java.util.*;

public class PPLPresentation{

    private ArrayList<PPLSlide> slideList;
    private Scene presentationScene;
    private int curSlide;

    public PPLPresentation()
    {
        slideList = new ArrayList<>();
        presentationScene = new Scene(new Group(), 800, 600);

        curSlide = -1;

        presentationScene.setOnMouseClicked(e -> switchSlide(1));

        presentationScene.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.RIGHT){
                switchSlide(1);
            }else if(e.getCode() == KeyCode.LEFT){
                switchSlide(-1);
            }
        });

    }

    public void addSlide(PPLSlide slide)
    {
        slideList.add(slide);
    }

    private void switchSlide(int dir)
    {
        curSlide += dir;

        if(curSlide < 0) curSlide=0;
        //System.out.printf("Size %d curSlide %d", slideList.size(), curSlide);
        if(curSlide < slideList.size()) {
            presentationScene.setRoot(slideList.get(curSlide).getLayout());
        }else if(curSlide == slideList.size()){
            Group group = new Group();
            Label label = new Label("Done");
            group.getChildren().add(label);
            presentationScene.setRoot(group);
        }
    }

    public Scene getPresentationScene()
    {
        return presentationScene;
    }
}

