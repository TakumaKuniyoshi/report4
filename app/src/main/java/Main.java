import jp.ac.uryukyu.ie.e205704.*;

public class Main {
    public static void main(String[] args){
        Warriar warriar= new Warriar("戦士", 10, 5);
        Enemy enemy = new Enemy("スライム", 15, 3);

        System.out.printf("%s vs. %s\n", warriar.getName(), enemy.getName());

        int turn = 0;
        while(warriar.isDead() == false && enemy.isDead() == false){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warriar.attackWithWeponSkill(enemy);
            enemy.attack(warriar);
        }
        System.out.println("戦闘終了");
    }
}