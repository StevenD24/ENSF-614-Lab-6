/*
 *  File Name: Text.java
 *  Assignment: ENSF 614 Lab 6 Exercise E
 *  Lab Section: Lab B01
 *  Completed by: Steven Duong (30022492)
 *  Submission Date: Mar 22, 2023
 */

import java.awt.*;

public class Text implements Component {
    protected int x;
    protected int y;
    protected String text;

    public Text(String text, int x, int y) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int fontSize = 10;
        g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
        g2d.drawString(this.text, this.x, this.y);
    }
}
