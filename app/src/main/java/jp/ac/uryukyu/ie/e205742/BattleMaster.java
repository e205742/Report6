package jp.ac.uryukyu.ie.e205742;

import java.util.ArrayList;

public class BattleMaster {
    
    ArrayList<Character> order = new ArrayList<>();
    public String name;
    public int Hp;
    public int ATK;
    public int vaitality;
    /**
     * コンストラクタ
     * @param _name　悟空の名前
     * @param _Hp　悟空の体力
     * @param _ATK　悟空の攻撃力
     * @param _vaitality　悟空の気力
     */
    public BattleMaster(String _name,int _Hp,int _ATK,int _vaitality){
        Goku goku = new Goku(_name,_Hp,_ATK,_vaitality);
        goku.addKillerTechnique(new Attack());
        goku.addKillerTechnique(new SpiritBullet("かめはめ波", 30, 10));
        goku.addKillerTechnique(new SpiritBullet("元気玉", 50, 20));

        Freeza freeza = new Freeza("フリーザ",500,50,150);
        freeza.addKillerTechnique(new Attack());
        freeza.addKillerTechnique(new SpiritBullet("デスビーム", 100, 20));
        freeza.addKillerTechnique(new SpiritBullet("デスボール", 200, 40));

        order.add(goku);
        order.add(freeza);
    }
    /**
     * プレイヤーと敵のステータスを表示する
     */
    public void showStatus() { //全キャラクタのステータスを表示（テスト用）
        for(var ch : order) {
            ch.showStatus();
        }
    }
    
    /**
     * 1ターンバトルを行う
     */
    public void battle() { 
        for(var ch : order) {
            ch.act(order);
        }
    }
    /**
     * プレイヤーまたは敵のHpが０以下になるまで戦いを続けるメソッド
     */
    public void Battle(){
        while(true){
            showStatus();
            battle();
            if(order.get(0).getHp()<=0 || order.get(1).getHp()<=0){
                System.out.println("戦闘終了");
                break;
            }
        }
    }
}
