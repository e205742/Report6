package jp.ac.uryukyu.ie.e205742;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BattleMasterTest {
    @Test
    public void attackTest(){
        int defHp=50;
        var master = new BattleMaster("悟空",100,20,70);
        master.order.get(0).killerTechniques.get(0).execute(master.order.get(0), master.order.get(1));
        master.order.get(1).killerTechniques.get(0).execute(master.order.get(1), master.order.get(0));
        assertEquals(defHp, master.order.get(0).getHp());
        
    }



    
}
