package com.jamescho.game.main.main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cortman on 2/14/17.
 */
public class GameMain {
    private static final String GAME_TITLE = "Java Game Development Framework";
    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 800;
    public static Game sGame;

    public static void main(String[] args) {
        JFrame frame = new JFrame(GAME_TITLE);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(GAME_WIDTH,GAME_HEIGHT);
        frame.setResizable(false);

        showCrappyUI(frame);

        frame.setVisible(true);
    }

    private static void showCrappyUI(JFrame frame) {
        /*
            If I have called set visible on the frame
            already then it seems like my panel needs an explicit
            size.
            Otherwise when I call setVisible it seems to be able to calculate
            it

         */

        CrappyPanel panel = new CrappyPanel();
        panel.setPreferredSize(new Dimension(480,270));
        frame.add(BorderLayout.CENTER, panel);
    }
}

class CrappyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.drawString("Hello World!", 400, 200);

        g.setColor(Color.darkGray);
        g.fillOval(350,350,100,100);

        g.setColor(Color.white);
        g.fillRect(300, 300, 200, 200);
        g.setColor(Color.darkGray);
        g.fillOval(350,350,100,100);
    }
}



