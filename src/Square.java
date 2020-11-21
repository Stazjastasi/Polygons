import java.awt.*;

public class Square extends Polygon {
    public Square(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g) {
        g.drawRect(getCenterPoint().x -10, getCenterPoint().y -10, 20, 20);
    }
}
