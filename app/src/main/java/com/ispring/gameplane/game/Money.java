package com.ispring.gameplane.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

import java.util.List;

public class Money extends AutoSprite {

    private int value = 1;//钱的价值

    public Money(Bitmap bitmap){
        super(bitmap);
    }
    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    @Override
    protected void afterDraw(Canvas canvas, Paint paint, GameView gameView) {
        super.afterDraw(canvas, paint, gameView);
    }

    //添加金币数后，会销毁金币
    public void addMoney(GameView gameView){
        //向GameView中添加得分并销毁金币
        gameView.addMoney(value);
        destroy();
    }
}