package hk.edu.polyu.comp.comp2021.jungle.model;

import hk.edu.polyu.comp.comp2021.jungle.Command.Command;
import hk.edu.polyu.comp.comp2021.jungle.Command.MoveCommand;
import hk.edu.polyu.comp.comp2021.jungle.Expection.InputException;
import hk.edu.polyu.comp.comp2021.jungle.Expection.siteException;
import hk.edu.polyu.comp.comp2021.jungle.model.JungleGame;
import org.junit.Test;


public class JungleGameTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @Test
    public void testJungleGameConstructor() throws InputException, siteException {
        JungleGame game = new JungleGame();
        assert true;
        Command[] commandlist = new Command[100];
        game.printBoard();
        /*
        Command a = new MoveCommand("G3","G4","x",game.board);
        Command a1 = new MoveCommand("G7","G6","y",game.board);
        Command a2 = new MoveCommand("G6","G5","y",game.board);
        Command a3 = new MoveCommand("G5","G4","y",game.board);
        a.execute();
        a1.execute();
        a2.execute();
        game.printBoard();
        a3.isVaild();
        a3.execute();
        game.printBoard();
        }catch (InputException e){
            System.out.println(e.toString());
        } catch (siteException e) {
            System.out.println(e.toString());
        }
        */

        /* Landing test
            commandlist[0] = new MoveCommand("G3","G4","x",game.board);
            commandlist[1] = new MoveCommand("G4","F4","x",game.board);
            commandlist[2] = new MoveCommand("f4","f5","x",game.board);
            commandlist[3] = new MoveCommand("f5","f6","x",game.board);
            commandlist[4] = new MoveCommand("g7","f7","y",game.board);
            commandlist[5] = new MoveCommand("f6","f7","x",game.board);
        */
        /*
            commandlist[0] = new MoveCommand("a7","a6","y",game.board);
            commandlist[1] = new MoveCommand("a6","b6","y",game.board);
            commandlist[2] = new MoveCommand("b6","c6","y",game.board);
            commandlist[3] = new MoveCommand("c6","d6","y",game.board);
            commandlist[4] = new MoveCommand("d6","e6","y",game.board);
            commandlist[5] = new MoveCommand("e6","f6","y",game.board);
            commandlist[6] = new MoveCommand("f6","f5","y",game.board);
            commandlist[7] = new MoveCommand("f5","f4","y",game.board);
            commandlist[8] = new MoveCommand("g3","f3","x",game.board);
            commandlist[9] = new MoveCommand("f3","f4","x",game.board);
        */
        commandlist[0] = new MoveCommand("G3", "G4", "x", game.board);
        commandlist[1] = new MoveCommand("G4", "F4", "x", game.board);
        commandlist[2] = new MoveCommand("f4", "e4", "x", game.board);
        commandlist[3] = new MoveCommand("e3", "e2", "x", game.board);
        commandlist[4] = new MoveCommand("g1", "g2", "x", game.board);
        commandlist[5] = new MoveCommand("g2", "g3", "x", game.board);
        commandlist[6] = new MoveCommand("g3", "f3", "x", game.board);
        //commandlist[7] = new MoveCommand("g7", "f7", "y", game.board);
        commandlist[7] = new MoveCommand("f3", "f4", "x", game.board);

       // commandlist[7] = new MoveCommand("f3", "e3", "x", game.board);
        //commandlist[8] = new MoveCommand("e3", "d3", "x", game.board);
        //commandlist[9] = new MoveCommand("d3", "d4", "x", game.board);
        //commandlist[10] = new MoveCommand("d4", "e4", "x", game.board);
       // commandlist[7] = new MoveCommand("f3", "f4", "x", game.board);

try {
    for (int a = 0; a <=7; a++) {
        Command c = commandlist[a];
        game.printBoard();
        if (c.isVaild()) {
            c.execute();
        }


    }
    game.printBoard();
}catch (InputException e){
    System.out.println(e.toString());
}
    }
}