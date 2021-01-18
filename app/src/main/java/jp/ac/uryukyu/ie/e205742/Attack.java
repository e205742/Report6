package jp.ac.uryukyu.ie.e205742;

public class Attack implements KillerTechnique{
    
    @Override
    public String name() {
        return "殴る"; 
    }

    @Override
    public void execute(Character executer, Character target) {
        target.damage(executer.getATK()) ;
        System.out.println(executer.getName() + "の攻撃!!");
        System.out.println(executer.getName() + "は" + target.getName() + "に" + executer.getATK() + "ポイントのダメージを与えた!");
    }
}
