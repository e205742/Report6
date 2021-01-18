package jp.ac.uryukyu.ie.e205742;
/**
 * 気弾系の必殺技のクラス
 */
public class SpiritBullet implements KillerTechnique {
    //必殺技は個別の名前を持つ
    private String name;
    private int ATK; //攻撃力
    private int vitality; //消費vitality

    /**
     * コンストラクタ
     * @param _name　必殺技の名前
     * @param _ATK　必殺技の攻撃力
     * @param _vitality　消費する気力量
     */
    public SpiritBullet(String _name,int _ATK,int _vitality){
        this.name=_name;
        this.ATK=_ATK;
        this.vitality=_vitality;
    }


    @Override
    public String name() {
        return name; 
    }

    @Override
    public void execute(Character executer, Character target) {
        System.out.println(executer.getName() + "は" + name + "を使った!!");
        target.damage(ATK);
        executer.useMp(vitality);
        System.out.println(target.getName()+"に"+ATK+"ポイントのダメージをあたえた!!");
    }
    
}
