package com.ispring.gameplane.game;

import android.graphics.Bitmap;
/**
 * 金币类
 */
public class Gold extends Money {
    public Gold(Bitmap bitmap){
        super(bitmap);
        setValue(10);//拾取到1个可以得10分
    }
}
