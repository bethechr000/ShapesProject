import javax.swing.*;


public class Game extends JFrame {

    Board board;
    public Game() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setTitle("Shapes Project");
        board = new Board();
        add(board);
        board.setup();

    }



    public static void main(String[] args){

        Game game = new Game();
        game.board.setup();

    }

}