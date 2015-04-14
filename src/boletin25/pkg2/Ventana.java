/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25.pkg2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author oquintansocampo
 */
public class Ventana implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    
    public Ventana() {
        marco = new JFrame(" CURSO DAM ");
        panel = new JPanel();
        boton1 = new JButton(" Programación ");
        boton2 = new JButton(" Bases ");
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        
        marco.setSize(200, 100);
        marco.setResizable(false);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton1 == e.getSource()) {
            marco.setTitle("Programación");
        } else if (boton2 == e.getSource()) {
            marco.setTitle("Bases de Datos");
        }
    }
}
