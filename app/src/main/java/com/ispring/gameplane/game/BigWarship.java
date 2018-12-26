package com.ispring.gameplane.game;

import android.graphics.Bitmap;

/**
 * 大战舰类，体积中等偏大，抗打击能力中等
 */
public class BigWarship extends Warship {

    public BigWarship(Bitmap bitmap){
        super(bitmap);
        setPower(10);//大战舰抗抵抗能力为10，即需要10颗子弹才能销毁大战舰
        setValue(30000);//销毁一个大战舰可以得30000分
    }

}