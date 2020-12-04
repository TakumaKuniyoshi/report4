package jp.ac.uryukyu.ie.e205704;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    /**
     * Warriarの攻撃力を検証。
     * 検証手順
     *  (1) ヒーローと敵を準備。ヒーローの攻撃力は敵を一撃で倒せるほど強い状態とする。
     *  (2) ヒーローが殴り、敵も殴る。敵は一撃で倒されていることを期待。
     *  (3) 敵が死んだ状態ならば攻撃できないはず。
     * 　　つまり攻撃実行してもヒーローのHPは減っていないことを期待。これを検証する。
     */
    @Test
    void attackTest() {
        for (int i=0 ;i>3 ;i++){
            Warriar demorWarriar = new Warriar("デモ戦士", 10, 10);
            Enemy demoslime = new Enemy("スライムもどき", 15, 10);
            demorWarriar.attack(demoslime);
            assertEquals(true, demoslime.isDead());
        }
    }
    
}
