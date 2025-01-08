import jp.ac.uryukyu.ie.e245751.*;
public class Main {
    public static void main(String[] args) {
        GameMaster gameMaster = new GameMaster();
        for(int i=0;i<4;i++){
            gameMaster.put();
            gameMaster.checkWinner();
        }

        


    }

}
