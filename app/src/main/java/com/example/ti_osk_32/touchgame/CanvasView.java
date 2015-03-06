package com.example.ti_osk_32.touchgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

import com.example.ti_osk_32.touchgame.objects.Enemy;

/**
 * Created by TI-OSK-32 on 2015/03/01.
 */
public class CanvasView extends View {

    public CanvasView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        // Enemy型の変数「enemy」を宣言
        Enemy enemy;
        // 変数enemyにEnemyインスタンスを生成・代入
        // インスタンスは「new」というキーワードで生成することができます。
        // 料理でいうと、レシピから実際の料理を作ったイメージ。
        // 引数として、x座標500、y座標300を渡しています。
        enemy = new Enemy(500, 300);
        // 生成したインスタンスのdrawメソッドを呼び出しています。
        // AndroidStudioで、Ctrlキーを押しながらメソッド名をクリックして
        // みてください。実際のメソッドにジャンプできます。
        enemy.draw(canvas);

        // 変数なのでこのように、宣言と代入をわけなくても、
        // いきなり初期化できます。
        // ここではenemy2という変数を新たに用意、2個目のインスタンスを生成し、
        // drawメソッドを呼び出しています。
        Enemy enemy2 = new Enemy(700, 500);
        enemy2.draw(canvas);

    }
}
