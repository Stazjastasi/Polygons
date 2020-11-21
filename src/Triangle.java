import java.awt.*;

public class Triangle extends Polygon {
    public Triangle(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g) {
        g.drawLine(getCenterPoint().x, getCenterPoint().y-10, getCenterPoint().x-10, getCenterPoint().y+10);
        g.drawLine(getCenterPoint().x-10, getCenterPoint().y+10,
                getCenterPoint().x+10, getCenterPoint().y+10);
        g.drawLine(getCenterPoint().x+10, getCenterPoint().y+10, getCenterPoint().x, getCenterPoint().y-10);
    }
}
