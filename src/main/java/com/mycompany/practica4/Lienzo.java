
package com.mycompany.practica4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


public class Lienzo extends JPanel {
    private Color colorFondo;
    private Color colorEstela;
    private final int nPoints;
    private final ArrayList<Point> trazaPuntos;
    
    public Lienzo() {
        this.colorFondo = Color.white;
        this.colorEstela = Color.red;
        this.nPoints = 5;
        this.trazaPuntos = new ArrayList<>();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
                this.setBackground(colorFondo);
        this.setForeground(colorEstela);

        trazaPuntos.forEach((p) -> {
            g.fillOval(p.x, p.y, 10, 10);
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    void addPunto(Point punto) {
        trazaPuntos.add(0, punto);
    }
    
    void cambiaFondo(Color color) {
        colorFondo = color;
    }

    void cambiaEstela(Color color) {
        colorEstela = color;
    }

    void eliminaPunto() {
        if (trazaPuntos.size() > nPoints) {
            trazaPuntos.remove(nPoints);
        }
    }

}
