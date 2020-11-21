import java.awt.*;

public class Rectangle extends Polygon {
    public Rectangle(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g) {
        g.drawRect(getCenterPoint().x -20, getCenterPoint().y -10, 40, 20);
    }
}
