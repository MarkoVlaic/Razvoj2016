package com.ppl.api.test;

import com.ppl.api.core.content.PPLTextContent;
import com.ppl.api.core.presentationElement.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GuiTest extends Application{

    private static PPLPresentation presentation = new PPLPresentation();
    private static PPLSlide slide1 = new PPLSlide();
    private static PPLSlide slide2 = new PPLSlide();

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        PPLText text1 = new PPLText();
        text1.setContent(new PPLTextContent("This is slide 1"));
        slide1.addChild(text1);

        PPLText text2 = new PPLText();
        text2.setContent(new PPLTextContent("This is second slide"));
        slide2.addChild(text2);

        presentation.addSlide(slide1);
        presentation.addSlide(slide2);
       // presentation.nextSlide();

        stage.setScene(presentation.getPresentationScene());
        stage.show();
    }
}
