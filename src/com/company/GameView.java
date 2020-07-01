package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class GameView extends JPanel {
    private int column;
    private int row;
    private static final int size = 50;

    private boolean zoomer;
    private double zoomFactor;

    public GameView() {

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        row = getHeight()/size;
        column = getWidth()/size;
        
        g.setColor(Color.white);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                g.drawRect(j*size, i*size, size, size);
            }
        }
//        for (int i = 0; i < row; i++){
//            g.drawLine(0,size+i*size, size*column,size+i*size);
//        }
//
//        for(int j = 0; j< column;j++){
//            g.drawLine(size+j*size,0,size+j*size,size*row);
//        }
    }
}
