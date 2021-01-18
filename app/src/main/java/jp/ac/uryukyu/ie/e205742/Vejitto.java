package jp.ac.uryukyu.ie.e205742;
import java.util.ArrayList;
import java.util.Random;
/**
 * ベジットを召喚するためのクラス
 */
public class Vejitto extends Goku{
    /**
     * コンストラクタ
     * @param _name　名前
     * @param _Hp　体力
     * @param _ATK　攻撃力
     * @param _vitality　気力
     */
    public Vejitto(String _name,int _Hp,int _ATK,int _vitality){
        super(_name,_Hp,_ATK,_vitality);

    }
    @Override
    public void act(ArrayList<Character> targets){
        var rand = new Random();
        int index = rand.nextInt(killerTechniques.size());
        killerTechniques.get(index).execute(this, targets.get(1));
    }
}
