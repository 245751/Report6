package jp.ac.uryukyu.ie.e245751;
import java.util.Scanner;
//ゲームの進行管理などを行うクラス
public class GameMaster {
    Bord bord = new Bord();
    int player = 0;//現在のプレイヤーを表します。0は黒番、1は白番を表します。
    Boolean chekFlag = false;//碁石を置くことが出来るかどうかを判断するために使います
    Scanner scanner= new Scanner(System.in);
    public GameMaster(){
        bord.bordReset();//盤を生成
    }

    //プレイヤーが碁石を置くためのメソッド。ターン管理も行う。
    public void put(){
        while(chekFlag==false){
            System.out.println("座標を入力してください");
            String coordinate = scanner.nextLine();
            String[] coordinates = coordinate.split("[, ]");
            CheckPut( Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
            if(chekFlag==true){
                bord.putStone(player, Integer.parseInt(coordinates[0]),Integer.parseInt(coordinates[1]));
                bord.display();
            }
        }
        if(player==0){player=1;}
        else{player=0;}
        chekFlag=false;
    }
    
    //揃っている箇所があるかを判定するメソッド
    public void checkWinner(){
        char[][] tempBord=bord.getBord();//ボード中身を確認するための一時的なもの
        //横の判定
        for(char[] row:tempBord){
            for(int shift=0;shift<4;shift++){
                if(row[shift]==row[shift+1] && row[shift+1]==row[shift+2] && row[shift+2]==row[shift+3] && row[shift+3]==row[shift+4] && row[shift]=='○'){
                    System.out.println("○の横揃った！！");
                }
                if(row[shift]==row[shift+1] && row[shift+1]==row[shift+2] && row[shift+2]==row[shift+3] && row[shift+3]==row[shift+4] && row[shift]=='●'){
                    System.out.println("●の横揃った！！");
                }
            }
        }

        //縦の判定
        for(int line=0;line<8;line++){
            for(int move=0;move<4;move++){
                if(tempBord[move][line]==tempBord[move+1][line] && tempBord[move+1][line]==tempBord[move+2][line] && tempBord[move+2][line]==tempBord[move+3][line] && tempBord[move+3][line]==tempBord[move+4][line] && tempBord[move][line]=='○'){
                    System.out.println("○の縦揃った！！");
                }
                if(tempBord[move][line]==tempBord[move+1][line] && tempBord[move+1][line]==tempBord[move+2][line] && tempBord[move+2][line]==tempBord[move+3][line] && tempBord[move+3][line]==tempBord[move+4][line] && tempBord[move][line]=='●'){
                    System.out.println("●の縦揃った！！");
                }
            }
        }

        //斜めの判定
        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
                if(tempBord[x][y]==tempBord[x+1][y+1] && tempBord[x+1][y+1]==tempBord[x+2][y+2] && tempBord[x+2][y+2]==tempBord[x+3][y+3] && tempBord[x+3][y+3]==tempBord[x+4][y+4] && tempBord[x][y]=='○'){
                    System.out.println("○の斜め揃った！！（１）");
                }
                if(tempBord[x][y]==tempBord[x+1][y+1] && tempBord[x+1][y+1]==tempBord[x+2][y+2] && tempBord[x+2][y+2]==tempBord[x+3][y+3] && tempBord[x+3][y+3]==tempBord[x+4][y+4] && tempBord[x][y]=='●'){
                    System.out.println("●の斜め揃った！！（１）");
                }
            }
        }
        for(int x=4;x<8;x++){
            for(int y=0;y<4;y++){
                if(tempBord[x][y]==tempBord[x-1][y+1] && tempBord[x-1][y+1]==tempBord[x-2][y+2] && tempBord[x-2][y+2]==tempBord[x-3][y+3] && tempBord[x-3][y+3]==tempBord[x-4][y+4] && tempBord[x][y]=='○'){
                    System.out.println("○の斜め揃った！！（2）");
                }
                if(tempBord[x][y]==tempBord[x-1][y+1] && tempBord[x-1][y+1]==tempBord[x-2][y+2] && tempBord[x-2][y+2]==tempBord[x-3][y+3] && tempBord[x-3][y+3]==tempBord[x-4][y+4] && tempBord[x][y]=='●'){
                    System.out.println("●の斜め揃った！！（2）");
                }
            }
        }
    }

    //碁石をおくことが出来るかを調べるためのメソッド
    public void CheckPut(int x,int y){
        char[][] tempBord = bord.getBord();
        if(tempBord[y-1][x-1]!='*'){
            System.out.println("ここはすでに置かれています");
        }
        else{
            chekFlag=true;
        }
    }


}
