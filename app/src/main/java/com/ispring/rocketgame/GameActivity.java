package com.ispring.rocketgame;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.ispring.rocketgame.game.GameView;


public class GameActivity extends Activity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        gameView = (GameView)findViewById(R.id.gameView);
        int[] bitmapIds = {
                R.drawable.initrocket,
                R.drawable.explosion,
                R.drawable.yellow_bullet,
                R.drawable.blue_bullet,
                R.drawable.smallwarship,
                R.drawable.middlewarship,
                R.drawable.bigwarship,
                R.drawable.bomb_award,
                R.drawable.bullet_award,
                R.drawable.pause1,
                R.drawable.pause2,
                R.drawable.bomb,
                R.drawable.boom,
                R.drawable.middlerocket,
                R.drawable.maxrocket,
                R.drawable.buy,
                R.drawable.buy_ing,
                R.drawable.bigmoney,
                R.drawable.money,
                R.drawable.superwarship,
                R.drawable.xwarship
        };
        gameView.start(bitmapIds);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(gameView != null){
            gameView.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(gameView != null){
            gameView.destroy();
        }
        gameView = null;
    }
}