/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomplejos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GUI extends JFrame implements ActionListener {
    private JButton boton1,boton2,suma,resta,multiplicacion,division,norma,conjugada;
    private JTextField real,imaginario;
    private JLabel etiqueta1,etiqueta2;

    public GUI(){
        boton1 = new JButton("Ok");
        boton2 = new JButton("");
        real = new JTextField("");
        imaginario = new JTextField("");
        multiplicacion = new JButton("Suma");
        division = new JButton("Suma");
        norma = new JButton("Suma");
        conjugada = new JButton("Suma");
        suma = new JButton("Suma");
        
        texto = new JTextField("");
        etiqueta = new JLabel("");
        this.getContentPane().setLayout(new GridLayout(2,3));
        this.getContentPane().add(texto);
        this.getContentPane().add(etiqueta);
        this.getContentPane().add(boton);
        
        boton.addActionListener(this);
        boton.setActionCommand("ok");
        
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("ok"))
            etiqueta.setText(texto.getText());
    }
}