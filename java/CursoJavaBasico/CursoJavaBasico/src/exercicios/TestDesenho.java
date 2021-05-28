package exercicios;

import javax.swing.JFrame;

public class TestDesenho {
    public static void main(String[] args) {
        Desenho panel = new Desenho();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(230, 250);
        app.setVisible(true);
    }
}
