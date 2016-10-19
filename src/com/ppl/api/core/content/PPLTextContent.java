package com.ppl.api.core.content;

import javafx.scene.Node;
import javafx.scene.control.Label;

public class PPLTextContent extends PPLContent{


    private String content;

    public PPLTextContent()
    {
        content = "";
    }
    public PPLTextContent(String content)
    {
        this.content = content;
    }


    /*@Override
    public void display(Node node)
    {
        if(node.getClass() != Label.class){
            try {
                throw new Exception("Cannot set text of class " + node.getClass());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Label txt = (Label)node;
        txt.setText(this.content);
    }*/

    @Override
    public void setContent(Object content)
    {
        this.content = content.toString();
    }

    @Override
    public String getContent()
    {
        return content;
    }


}
