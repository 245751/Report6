import jp.ac.uryukyu.ie.e245751.*;
public class Main {
    public static void main(String[] args) {
        GameMaster gameMaster = new GameMaster();
        gameMaster.put(8,4);
        gameMaster.put(1,1);
        gameMaster.put(7,5);
        gameMaster.put(1,2);
        gameMaster.put(6,6);
        gameMaster.put(1,3);
        gameMaster.put(5,7);
        gameMaster.put(1,4);
        gameMaster.put(4,8);
        gameMaster.put(4,8);
        gameMaster.checkWinner();

        


    }

}
