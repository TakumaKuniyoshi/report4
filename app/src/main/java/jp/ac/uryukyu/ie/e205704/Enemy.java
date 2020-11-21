package jp.ac.uryukyu.ie.e205704;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if(dead){
            return;
        }
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(),damage);
        hero.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
    /**
     * 自身のnameを返す
     * @return name:自身の名前
    */
    public String getName(){
        return this.name;
    }
    /**
     * 自身のhitPointを返す
     * @return hitPoint:自身の体力
    */
    public int getHP(){
        return this.hitPoint;
    }     
    /**
     * 自身のattackを返す
     * @return attack:自身の攻撃力
    */
    public int getAttack(){
        return this.attack;
    }   
    /**
     * 自身のdeadを返す
     * @return dead:自身の生死状態
    */
    public boolean getDead(){
        return this.dead;
    } 
    /**
     * 自身の名前を設定
     * @param name
     */      
    public void setName(String name){
        this.name = name;
    }
    /**
     * 自身の体力を設定
     * @param hitPoint
     */
    public void setHP(int hitPoint){
        this.hitPoint = hitPoint;
    }     
    /**
     * 自身の攻撃力を設定
     * @param attack
     */
    public void setAttack(int attack){
        this.attack = attack;
    }   
    /**
     * 自身の生死状態を設定
     * @param dead
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }  
}