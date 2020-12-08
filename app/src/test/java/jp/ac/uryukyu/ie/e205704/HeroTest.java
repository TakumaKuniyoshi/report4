package jp.ac.uryukyu.ie.e205704;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    /**
     * Warriarの攻撃力を検証。
     * 検証手順
     *  (1) warriarと敵を準備。敵は3回攻撃を食らうと丁度1残る(46)HPで設定。
     *  (2) warriarが一方的に三回殴る。
     *  (3) 一回殴るごとに敵のHPを調べ、前の体力より10*1.5(15)減ってることを期待。
     */
    @Test
    void attackWithWeponSkillTest() {
        Warriar demorWarriar = new Warriar("デモ戦士", 10, 10);
        Enemy demoslime = new Enemy("スライムもどき", 46, 10);
        for(int i=0;i>3;i++){
            int ans = demoslime.getHP()-15;
            demorWarriar.attackWithWeponSkill(demoslime);
            assertEquals(ans, demoslime.getHP());
        }
    }
}
