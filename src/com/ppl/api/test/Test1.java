package com.ppl.api.test;

import com.ppl.api.core.presentationElement.*;

public class Test1 {

    public static void main(String[] args)
    {
        PPLPresentation presentation = new PPLPresentation();
        PPLSlide slide1 = new PPLSlide();
        slide1.addChild(new PPLText());
        slide1.addChild(new PPLSlide());
        presentation.addChild(slide1);
    }

}
