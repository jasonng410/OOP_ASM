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
        boolean success=true;
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
        /*
        commandlist[0] = new MoveCommand("G3", "G4", "x", game.board);
        commandlist[1] = new MoveCommand("G4", "F4", "x", game.board);
        commandlist[2] = new MoveCommand("f4", "e4", "x", game.board);
        commandlist[3] = new MoveCommand("e4", "d4", "x", game.board);
        commandlist[4] = new MoveCommand("d4", "c4", "x", game.board);
        commandlist[5] = new MoveCommand("c4", "b4", "x", game.board);
        commandlist[6] = new MoveCommand("b4", "b5", "x", game.board);
        commandlist[7] = new MoveCommand("b5", "b6", "x", game.board);
        commandlist[8] = new MoveCommand("a7", "b7", "y", game.board);
        commandlist[9] = new MoveCommand("b6", "a6", "x", game.board);
        commandlist[10] = new MoveCommand("a6", "a7", "x", game.board);
        commandlist[11] = new MoveCommand("a7", "b7", "x", game.board);
        //commandlist[7] = new MoveCommand("g7", "f7", "y", game.board);

       // commandlist[7] = new MoveCommand("f3", "e3", "x", game.board);
        //commandlist[8] = new MoveCommand("e3", "d3", "x", game.board);
        //commandlist[9] = new MoveCommand("d3", "d4", "x", game.board);
        //commandlist[10] = new MoveCommand("d4", "e4", "x", game.board);
       // commandlist[7] = new MoveCommand("f3", "f4", "x", game.board);
         */
        /*
        String[] steps = {"g3","g4","f4","e4","d4","c4","b4","b5","b6","b7","a7","b7","b6"};
        String[] steps2= {"a3", "a4", "a5", "a6", "a7", "a8", "a9", "b9", "b8", "b7", "c7", "d7", "e7", "f7", "f8", "f9", "g9","g8","g7"};
        for (int a = 0; a < steps.length - 1; a++) {
            System.out.println(steps[a] + "--" + steps[a + 1]);
            commandlist[a] = new MoveCommand(steps[a], steps[a + 1], "x", game.board);
        }


        try {
            for (int a = 0; a < steps.length - 1; a++) {
                Command c = commandlist[a];
                game.printBoard();
                if (c.isVaild()) {
                    c.execute();
                }


            }

            game.printBoard();
            for (int a = 0; a < steps2.length - 1; a++) {
                System.out.println(steps2[a] + "--" + steps2[a + 1]);
                commandlist[a] = new MoveCommand(steps2[a], steps2[a + 1], "x", game.board);
            }


            try {
                for (int a = 0; a < steps2.length - 1; a++) {
                    Command c = commandlist[a];
                    game.printBoard();
                    if (c.isVaild()) {
                        c.execute();
                    }


                }

                game.printBoard();
            System.out.println(game.gameEnd());


        } catch (InputException e) {
            e.printStackTrace();
        }
    } catch (InputException e) {
            e.printStackTrace();
        } catch (siteException e) {
            e.printStackTrace();
        }
        */
        commandlist[0] = new MoveCommand("e3", "d3", "x", game.board);
        commandlist[1] = new MoveCommand("d3", "d4", "x", game.board);
        commandlist[2] = new MoveCommand("d4", "d5", "x", game.board);
        commandlist[3] = new MoveCommand("d5", "d6", "x", game.board);
        commandlist[4] = new MoveCommand("d6", "d7", "x", game.board);
        commandlist[5] = new MoveCommand("d7", "d8", "x", game.board);
        //commandlist[6] = new MoveCommand("d8", "d9", "x", game.board);
        commandlist[6] = new MoveCommand("e7", "e8", "y", game.board);
        commandlist[7] = new MoveCommand("e8", "d8", "y", game.board);
        commandlist[8] = new MoveCommand("d8", "d9", "y", game.board);
        //commandlist[8] = new MoveCommand("d8", "e8", "y", game.board);
        //commandlist[9] = new MoveCommand("e8", "d8", "y", game.board);

        try {
            for (int a = 0; a < 9; a++) {
                Command c = commandlist[a];
                game.printBoard();
                if (c.isVaild()) {
                    c.execute();
                }


            }

            game.printBoard();
            System.out.println(game.gameEnd());
        } catch (InputException e) {
            success=false;
            e.printStackTrace();

        } catch (siteException e) {
            e.printStackTrace();
        }finally {
            assert success;
        }
    }
}
