package jp.ac.uryukyu.ie.e205704;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Warriar extends Hero{
    double ozz = 1.5;
    public Warriar (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }
    public void attackWithWeponSkill(LivingThing enemy){
        if (dead){
            return;
        }
        int damage = (int)(attack * ozz);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, enemy.getName(), damage);
        enemy.wounded(damage);
    }
}
