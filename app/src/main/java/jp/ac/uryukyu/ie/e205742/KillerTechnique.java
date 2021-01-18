package jp.ac.uryukyu.ie.e205742;
/**
 * 必殺技のクラス
 */
interface KillerTechnique {
    String name();
    void execute(Character executer, Character target);
}
