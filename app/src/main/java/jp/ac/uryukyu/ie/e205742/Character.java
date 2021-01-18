package jp.ac.uryukyu.ie.e205742;

import java.util.ArrayList; 

/**
 * 全てのキャラクターの元の設計図を作るクラス
 */
abstract class Character {
    private String name; //キャラクターの名前
    public int Hp; //キャラクターの体力
    private int ATK; //キャラクターの攻撃力
    private int vitality; //キャラクターの気力
    
    /**
     * 名前を返すメソッド
     * @return　名前
     */
    public String getName(){ return name; }
    /**
     * 体力を返すメソッド
     * @return　体力
     */
    public int getHp(){ return Hp;}
    /**
     * 攻撃力を返すメソッド
     * @return　攻撃力
     */
    public int getATK(){ return ATK;}
    /**
     * 気力量を返すメソッド
     * @return　気力
     */
    public int getVitality(){ return vitality;}

    /**
     * 引数でもらったダメージ量をHpから引く
     * @param value ダメージ量
     */
    public void damage(int value){
        this.Hp -= value;

    }

    /**
     * 引数で受け取った使用した気力量をvitalityから引く
     * @param mp 使用した気力量
     */
    public void useMp(int mp){
        this.vitality -= mp;

    }
    
    /**
     * コンストラクタ
     * @param _name　名前
     * @param _Hp　　体力
     * @param _vitality　気力
     */
    public Character(String _name, int _Hp, int _ATK, int _vitality){
        this.name=_name;
        this.Hp=_Hp;
        this.ATK=_ATK;
        this.vitality=_vitality;
    }
    
    ArrayList<KillerTechnique> killerTechniques = new ArrayList<>();
    /**
     * 必殺技を追加するメソッド
     * @param _killerTechnique　キャラが持つ必殺技
     */
    public void addKillerTechnique(KillerTechnique _killerTechnique) {
        killerTechniques.add(_killerTechnique);
    }
    
    /**
     * 今のキャラが持つステータスを表示する
     */
    public void showStatus() {
        System.out.printf("%s:体力 %d  気力 %d\n", name, Hp, vitality);
    }
    
    /**
     * 引数から敵を受け取り敵に対して攻撃を行うメソッド
     * @param targets 敵
     */
    abstract void act(ArrayList<Character> targets); 
}
