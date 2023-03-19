/*
 *  File Name: BorderDecorator.java
 *  Assignment: ENSF 614 Lab 6 Exercise E
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.awt.*;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component cmp, int x, int y, int width, int height) {
        super(cmp, x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        this.cmp.draw(g);
        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9},
                0);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(dashed);
        Color oldColor = g2d.getColor();
        g2d.drawRect(x, y, width, height);
        g2d.setColor(oldColor);
    }
}
