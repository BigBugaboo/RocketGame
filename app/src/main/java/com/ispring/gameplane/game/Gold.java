package com.ispring.gameplane.game;

import android.graphics.Bitmap;

public class Gold extends Money {
    public Gold(Bitmap bitmap){
        super(bitmap);
        setValue(10);//拾取到可以得1个
    }
}
