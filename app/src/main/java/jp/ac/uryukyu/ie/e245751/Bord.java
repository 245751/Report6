package jp.ac.uryukyu.ie.e245751;

public class Bord {
    int bordLength=8; //盤の縦と横の長さ
    char[][] bord;
    //空の盤を作るためのメソッド
    public void bordReset(){
        bord = new char[bordLength][];
        for(int i = 0; i < bordLength; i++) {
            bord[i] =new char[9];
        }
        for(int i=0;i<bordLength;i++){
            for(int ii=0;ii<bordLength;ii++){
                bord[i][ii]=(char)('*');
            }
        }
        
    }

    //盤を表示するためのメソッド
    public void display(){
        for(char[] i:bord){
            System.out.println(i);
        }
        System.out.println();
    }

    //碁石を置くためのメソッド
    public void putStone(int player,int x,int y){
        x-=1;
        y-=1;
        if(player==0){bord[y][x]=(char)('○');}
        else{bord[y][x]=(char)('●');}
    }

    //bordのgetter
    public char[][] getBord(){return bord;}
}


