package com.ispring.rocketgame.game;

import android.graphics.Bitmap;
/**
 * 超级战舰类，体积大，抗打击能力中等
 */
public class SuperWarship extends Warship {
    public SuperWarship (Bitmap bitmap)
    {
        super(bitmap);
        setPower(50);//超级战舰抗抵抗能力为50，即需要500颗子弹才能销毁超级战舰
        setValue(50000);//销毁一个超级战舰可以得50000分)
    }
}
