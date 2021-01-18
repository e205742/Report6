import jp.ac.uryukyu.ie.e205742.BattleMaster;
import jp.ac.uryukyu.ie.e205742.BattleMasterNext;

public class Main {
    public static void main(String[] args) {
        var master = new BattleMaster("悟空",100,20,70);
        master.Battle();
        System.out.println("悟空は歯が立たない");
        System.out.println("悟空:「まだまだここからだ！！」");
        System.out.println("悟空はベジットに変身した");
        BattleMasterNext masterNext =  new BattleMasterNext();
        masterNext.Battle();
        System.out.println("悟空は見事フリーザを倒した！！");
    }
}
