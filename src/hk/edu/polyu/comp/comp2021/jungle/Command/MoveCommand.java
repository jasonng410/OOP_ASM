package hk.edu.polyu.comp.comp2021.jungle.Command;

import hk.edu.polyu.comp.comp2021.jungle.Expection.*;
import hk.edu.polyu.comp.comp2021.jungle.model.Chess;
import hk.edu.polyu.comp.comp2021.jungle.model.Enviroment;

public class MoveCommand extends Command {

    public String s1,s2;
    public int s1x,s1y,s2x,s2y;
    public Enviroment[][] board;
    public String site;

    public MoveCommand(String s1, String s2,String site, Enviroment[][] board) throws InputException {
        this.s1=s1;
        this.s2=s2;
        this.board=board;
        this.site=site;
//97-103 , 65-71
         s1y=s1.charAt(0);
         s1x=Character.getNumericValue(s1.charAt(1));
         s2y=s2.charAt(0);
         s2x=Character.getNumericValue(s2.charAt(1));
        if(s1y>=97&&s1y<=103){
            s1y=6-(103-s1y);
        }else if((s1y>=65&&s1y<=71)){
            s1y=6-(71-s1y);
        }else{
            throw new InputException();
        }
        if(s2y>=97&&s2y<=103){
            s2y=6-(103-s2y);
        }else if((s2y>=65&&s2y<=71)){
            s2y=6-(71-s2y);
        }else{
            throw new InputException();
        }
        s1x=9-s1x;
        s2x=9-s2x;
        System.out.println(board[s1x][s1y].toString());
    }
    public void execute(){
        Chess a= (Chess)board[s1x][s1y];
        Enviroment b= board[s2x][s2y];
        if(b==null){
            board[s2x][s2y]=a;
            board[s1x][s1y]=null;
        }else if(a.getRank()>=b.getRank()){
            board[s2x][s2y]=a;
            board[s1x][s1y]=null;
        }
    }

    public boolean isVaild() throws InputException, siteException {
        int move1,move2;
        move1=s1x+s1y;
        move2=s2x+s2y;
        int position;
        Enviroment a=board[s1x][s1y];
        Enviroment b=board[s2x][s2y];
        position=(Math.max(move1,move2)==move1)?move1-move2:move2-move1;
        if(position>1){
            throw new InputException("Position Error.");
        }else if(s1x>8||s1x<0||s1y<0||s1y>7||s2x>8||s2x<0||s2y<0||s2y>7){
            throw new InputException();
        }else if(!this.site.equals(board[s1x][s1y].getSite())){
            throw new siteException();
        }else if(board[s1x][s1y]==null){
            throw new InputException("Please select a chess.");
        }else if(b!=null){
            if((a.getSite().equals(b.getSite()))){
                throw new InputException("Already have chess.");
            }else if(a.getRank()<b.getRank()){
                throw new InputException("low rank.");
            }
        }
        return true;
    }

}
