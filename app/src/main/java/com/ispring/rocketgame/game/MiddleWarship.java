package com.ispring.rocketgame.game;

import android.graphics.Bitmap;

/**
 * 中战舰类，体积中等，抗打击能力中等
 */
public class MiddleWarship extends Warship {

    public MiddleWarship(Bitmap bitmap){
        super(bitmap);
        setPower(4);//中战舰抗抵抗能力为4，即需要4颗子弹才能销毁中战舰
        setValue(6000);//销毁一个中战舰可以得6000分
    }

}