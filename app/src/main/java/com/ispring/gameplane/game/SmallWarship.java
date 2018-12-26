package com.ispring.gameplane.game;

import android.graphics.Bitmap;

/**
 * 小战舰类，体积小，抗打击能力低
 */
public class SmallWarship extends Warship {

    public SmallWarship(Bitmap bitmap){
        super(bitmap);
        setPower(1);//小战舰抗抵抗能力为1，即一颗子弹就可以销毁小战舰
        setValue(1000);//销毁一个小战舰可以得1000分
    }

}