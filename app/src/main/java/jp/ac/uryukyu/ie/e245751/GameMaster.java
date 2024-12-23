package jp.ac.uryukyu.ie.e245751;
//ゲームの進行管理などを行うクラス
public class GameMaster {
    Bord bord = new Bord();
    int player = 0;//現在のプレイヤーを表します。0は黒番、1は白番を表します。
    public GameMaster(){
        bord.bordReset();//盤を生成
    }

    //プレイヤーが碁石を置くためのメソッド。ターン管理も行う。
    public void put(int x,int y){
        bord.putStone(player, x, y);
        bord.display();
        if(player==0){player=1;}
        else{player=0;}
    }



}
