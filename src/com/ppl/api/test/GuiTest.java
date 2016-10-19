package com.ppl.api.test;

import com.ppl.api.core.content.PPLTextContent;
import com.ppl.api.core.presentationElement.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GuiTest extends Application{

    private PPLSlide slide = new PPLSlide();
    private PPLText text = new PPLText();

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        text.setContent(new PPLTextContent("Nabavi cheez"));
        text.getGuiElement().setLayoutX(400);
        text.getGuiElement().setLayoutY(300);
        slide.getLayout().getChildren().add(text.getGuiElement());

        Scene scene = new Scene(slide.getLayout(), 800, 600);
        stage.setScene(scene);
        stage.show();
    }
}
