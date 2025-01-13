package jp.ac.uryukyu.ie.e245751;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BordTest {
    @Test
    //盤を作成して指定した場所におくことが出来るのかを確かめるテスト
    void putTest(){
        Bord demobord = new Bord();
        demobord.bordReset();
        demobord.putStone(0, 5, 6);
        char[][] tempBord=demobord.getBord();
        assertEquals(tempBord[5][4],'○');
    }
}