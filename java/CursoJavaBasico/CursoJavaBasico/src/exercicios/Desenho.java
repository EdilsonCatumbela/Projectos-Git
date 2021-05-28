package exercicios;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Desenho extends JPanel{
    public void paintComponet(Graphics g){
        super.paintComponent(g);

        //desenho o rosto
        g.setColor(Color.yellow);
        g.fillOval(10, 20, 200, 200);

        //desenho olho
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        g.fillOval(50, 110, 120, 60);

        g.setColor(Color.YELLOW);
        g.fillOval(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}
