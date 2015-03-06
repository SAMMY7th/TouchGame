package com.example.ti_osk_32.touchgame.objects;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Enemyクラス
 *
 * クラスはあくまで、インスタンスを作るための設計図。
 * 料理でいえばレシピのようなものです。
 *
 * クラス名(Enemy)の後ろにある「{」からこのファイルの一番最後の「}」
 * までがこのEnemyクラスに含まれます。
 */
public class Enemy {
    /**
     * フィールド
     *
     * privateはアクセス修飾子です。
     * このフィールドがこのクラス内でしか参照できないことを指します。
     */
    private float x;
    private float y;
    private float radius = 50;

    /**
     * コンストラクタ
     *
     * インスタンスをnewコマンドで生成した際に呼び出される初期処理です。
     * 今回は座標x,yを引数として受け取り、フィールドに設定しています。
     *
     * @param x x座標
     * @param y y座標
     */
    public Enemy(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 敵を描画するメソッド
     *
     * 引数としてCanvasを受け取り、青い円を描画しています。
     *
     * publicはアクセス修飾子。
     * インスタンス化した際、他のクラスから呼び出すことができるメソッドです。
     *
     * 戻り値はありません。なので「void」です。
     *
     * @param canvas 描画対象のCanvasインスタンス
     */
    public void draw(Canvas canvas) {
        // このPaintクラスは円を描くための「ペン」のような機能を持っています。
        // ペンの設計図(Paintクラス)から、newキーワードにより実際のペン(インスタンス)
        // を生成しています。
        Paint paint = new Paint();
        // setColorはPaintのメソッド。ペンに青色を設定しました。
        paint.setColor(Color.BLUE);
        // drawCircleはcanvasのメソッド。
        // フィールドの座標、半径、そして先ほど作成したペンを引数として渡し、
        // 円を描画しています。
        canvas.drawCircle(this.x, this.y, this.radius, paint);
    }

    /**
     * 【ちょっぴり応用編】
     * getter(ゲッター)
     *
     * フィールドの値を他クラスから参照する場合は、
     * このようにフィールドの取得するためのメソッドを作ります。
     *
     * @return X座標(float型)
     */
    public float getX() {
        return this.x;
    }

    /**
     * 【ちょっぴり応用編】
     * getter(ゲッター)
     *
     * フィールドの値を他クラスから参照する場合は、
     * このようにフィールドの取得するためのメソッドを作ります。
     *
     * Javaの文法上、フィールドをpublicにしても問題ないのですが、
     * オブジェクト指向ではこのように、フィールドは全部privateにして
     * 必要に応じてgetter, setterメソッドを作成します。
     * これを「カプセル化」といいます。
     *
     * @param x フィールドxに設定したい座標
     */
    public void setX(float x) {
        // 必要に応じてここで、設定する値のチェックなどを行います。
        // 今回は、必ず0以上のfloatしか設定されないようにしてみました。
        // (0未満の数字が引数で渡された場合は、this.xを0にしています。)
        if (x < 0) {
            this.x = x;
        }
        this.x = x;
    }
}
