package hk.edu.polyu.comp.comp2021.jungle;

import hk.edu.polyu.comp.comp2021.jungle.Command.*;
import hk.edu.polyu.comp.comp2021.jungle.Expection.InputException;
import hk.edu.polyu.comp.comp2021.jungle.Expection.siteException;
import hk.edu.polyu.comp.comp2021.jungle.model.JungleGame;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        JungleGame game = new JungleGame();
        Scanner in =new Scanner(System.in);
        String site="x";
        System.out.println("Player X please input your name.");
        game.setX(in.nextLine());
        System.out.println("Player Y please input your name.");
        game.setY(in.nextLine());
        game.printBoard();
        body:while (!game.gameEnd()){
            try{
            System.out.println("Player "+site+": Please input command.");
            String comman=in.nextLine();
            String[] com=comman.split(" ");
           // System.out.println(com[0]);
            switch(com[0]){
                case "move":
                    String s1=com[1];
                    String s2=com[2];
                    Command c=new MoveCommand(s1,s2,site,game.board);
                    if(c.isVaild()){
                        c.execute();
                    }
                    site=(site=="x")? "y":"x";
                    break;
                case "open":
                    System.out.println("OPEN GAME.");
                    break;
                case "save":
                    System.out.println("SAVE GAME.");
                    break;
                default:
                    break;
            }
            game.printBoard();

        }catch(InputException e){
                System.out.println(e.toString());
                continue body;
        } catch (siteException e) {
                System.out.println(e.toString());
                continue body;
            }
        }
        System.out.println("Winner is "+game.winner);
    }
}
