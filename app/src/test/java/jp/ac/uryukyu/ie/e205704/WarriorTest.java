package jp.ac.uryukyu.ie.e205704;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /**
     * Warriarの攻撃力を検証。
     * 検証手順
     *  (1) warriarと敵を準備。敵は3回攻撃を食らうと丁度1残る(46)HPで設定。
     *  (2) warriarが一方的に三回殴る。
     *  (3) 一回殴るごとに敵のHPを調べ、前の体力より10*1.5(15)減ってることを期待。
     */
    @Test
    void attackWithWeponSkillTest() {
        Warrior demorWarrior = new Warrior("デモ戦士", 10, 10);
        Enemy demoslime = new Enemy("スライムもどき", 46, 10);
        for(int i=0;i>3;i++){
            int ans = demoslime.getHP()-15;
            demorWarrior.attackWithWeponSkill(demoslime);
            assertEquals(ans, demoslime.getHP());
        }
    }
}
