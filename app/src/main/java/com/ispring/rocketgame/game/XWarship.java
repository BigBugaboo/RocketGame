package com.ispring.rocketgame.game;

import android.graphics.Bitmap;
/**
 * X战舰类，体积大，抗打击能力强
 */
public class XWarship extends Warship {
    public XWarship (Bitmap bitmap){
        super(bitmap);
        setPower(200);//X战舰抗抵抗能力为200，即需要200颗子弹才能销毁X战舰
        setValue(100000);//销毁一个X战舰可以得100000分
    }
}
