import java.awt.*;

public class Bullet extends Sprite {


    public Bullet(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }

    @Override
    public void move(int boardHeight, int boardWidth) {

    }


    @Override
    public void paint (Graphics g){

        g.setColor(color);
        g.fillRect(x, y, width, height);

    }

}
