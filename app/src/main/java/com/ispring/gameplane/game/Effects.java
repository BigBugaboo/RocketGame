package com.ispring.gameplane.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/**
 * 特效类，位置不可变，但是可以显示动态的效果
 */
public class Effects extends Sprite {

    private int segment = 14;//特效由14个片段组成
    private int level = 0;//最开始处于特效的第0片段
    private int explodeFrequency = 2;//每个特效片段绘制2帧

    public Effects(Bitmap bitmap){
        super(bitmap);
    }

    @Override
    public float getWidth() {
        Bitmap bitmap = getBitmap();
        if(bitmap != null){
            return bitmap.getWidth() / segment;
        }
        return 0;
    }

    @Override
    public Rect getBitmapSrcRec() {
        Rect rect = super.getBitmapSrcRec();
        int left = (int)(level * getWidth());
        rect.offsetTo(left, 0);
        return rect;
    }

    @Override
    protected void afterDraw(Canvas canvas, Paint paint, GameView gameView) {
        if(!isDestroyed()){
            if(getFrame() % explodeFrequency == 0){
                //level自加1，用于绘制下个特效片段
                level++;
                if(level >= segment){
                    //当绘制完所有的特效片段后，销毁特效
                    destroy();
                }
            }
        }
    }

    //得到绘制完整特效需要的帧数，即28帧
    public int getExplodeDurationFrame(){
        return segment * explodeFrequency;
    }
}