import jp.ac.uryukyu.ie.e245751.*;
public class Main {
    public static void main(String[] args) {
        GameMaster gameMaster = new GameMaster();
        while (gameMaster.GetContinueFlag()) {
            gameMaster.put();
            gameMaster.checkWinner();
        }
        


    }

}
