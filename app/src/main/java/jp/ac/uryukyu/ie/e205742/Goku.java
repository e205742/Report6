package jp.ac.uryukyu.ie.e205742;

import java.util.ArrayList;
import java.util.Random;
/**
 * 悟空を召喚するためのクラス
 */
public class Goku extends Character{
    /**
     * コンストラクタ
     * @param name 名前
     * @param Hp　体力
     * @param ATK　攻撃力
     * @param vitality　気力
     */
    public Goku(String name,int Hp,int ATK,int vitality){
        super(name,Hp,ATK,vitality);

    }
    
    /**
     * 引数で受け取った敵に対してランダムで必殺技を選び攻撃する
     */
    @Override
    public void act(ArrayList<Character> targets){
        var rand = new Random();
        int index = rand.nextInt(killerTechniques.size());
        killerTechniques.get(index).execute(this, targets.get(1));
    }

}
