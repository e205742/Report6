package jp.ac.uryukyu.ie.e205742;

import java.util.ArrayList;

public class BattleMasterNext {
    
    ArrayList<Character> order = new ArrayList<>();

    public BattleMasterNext(){
        Vejitto vejitto = new Vejitto("ベジット",1000,100,300);
        vejitto.addKillerTechnique(new Attack());
        vejitto.addKillerTechnique(new SpiritBullet("かめはめ波",300,40));
        vejitto.addKillerTechnique(new SpiritBullet("元気玉", 400, 60));
        vejitto.addKillerTechnique(new SpiritBullet("ファイナルかめはめ波", 500, 100));


        Freeza freeza = new Freeza("フリーザ",500,50,150);
        freeza.addKillerTechnique(new Attack());
        freeza.addKillerTechnique(new SpiritBullet("デスビーム", 100, 20));
        freeza.addKillerTechnique(new SpiritBullet("デスボール", 200, 40));

        order.add(vejitto);
        order.add(freeza);
    }

    public void showStatus() { //全キャラクタのステータスを表示（テスト用）
        for(var character : order) {
            character.showStatus();
        }
    }

    public void battle() { //１ターン実行する
        for(var character : order) {
            character.act(order);
        }
    }

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
