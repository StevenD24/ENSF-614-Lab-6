/*
 *  File Name: ColouredFrameDecorator.java
 *  Assignment: ENSF 614 Lab 6 Exercise E
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.awt.*;

public class ColouredFrameDecorator extends Decorator {

    protected int thickness;

    public ColouredFrameDecorator(Component cmp, int x, int y, int width, int height, int thickness) {
        super(cmp, x, y, width, height);
        this.thickness = thickness;
    }

    @Override
    public void draw(Graphics g) {
        this.cmp.draw(g);
        Graphics2D g2d = (Graphics2D) g;
        Stroke oldStroke = g2d.getStroke();
        Color oldColor = g2d.getColor();
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(Color.red);
        g2d.drawRect(x, y, width, height);
        g2d.setStroke(oldStroke);
        g2d.setColor(oldColor);
    }
}
