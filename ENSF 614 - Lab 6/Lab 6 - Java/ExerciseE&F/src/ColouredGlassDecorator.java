/*
 *  File Name: ColouredGlassDecorator.java
 *  Assignment: ENSF 614 Lab 6 Exercise F
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.awt.*;

public class ColouredGlassDecorator extends Decorator {

    public ColouredGlassDecorator(Component cmp, int x, int y, int width, int height) {
        super(cmp, x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        this.cmp.draw(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.green);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1 * 0.1f));
        g2d.fillRect(25, 25, 110, 110);
    }
}
