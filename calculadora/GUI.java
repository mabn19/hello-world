package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame implements ActionListener {

    private JButton bSuma, bResta, bMultiplicacion, bDivision, bConjugada, bNorma;

    private JTextField tReal1, tImag1, tReal2, tImag2;

    private JLabel lSum1, lSum2, lReal1, lReal2, lImag1, lImag2, lRes1, lRes2, lCom;

    public GUI() {
        bSuma = new JButton("Sumar");
        bResta = new JButton("Restar");
        bMultiplicacion = new JButton("Multiplicar");
        bDivision = new JButton("Dividir");
        bConjugada = new JButton("Conjugar");
        bNorma = new JButton("Norma");

        tReal1 = new JTextField("");
        tReal2 = new JTextField("");
        tImag1 = new JTextField("");
        tImag2 = new JTextField("");

        lSum1 = new JLabel("+");
        lSum2 = new JLabel("+");
        lReal1 = new JLabel("Parte real #1");
        lReal2 = new JLabel("Parte real #2");
        lImag1 = new JLabel("Parte imaginaria #1");
        lImag2 = new JLabel("Parte imaginaria #2");
        lCom = new JLabel("Resultado:");
        lRes1 = new JLabel("");
        lRes2 = new JLabel("");

        JPanel p1 = new JPanel(new GridLayout(4, 2, 20, 30));
        Box c1 = Box.createHorizontalBox();
        Box c2 = Box.createVerticalBox();

        p1.add(lReal1);
        p1.add(lImag1);
        p1.add(tReal1);
        p1.add(tReal2);
        p1.add(lReal2);
        p1.add(lImag2);
        p1.add(tImag1);
        p1.add(tImag2);

        c1.add(Box.createHorizontalStrut(6));
        c1.add(bSuma);
        c1.add(Box.createHorizontalStrut(4));
        c1.add(bResta);
        c1.add(Box.createHorizontalStrut(4));
        c1.add(bMultiplicacion);
        c1.add(Box.createHorizontalStrut(4));
        c1.add(bDivision);
        c1.add(Box.createHorizontalStrut(4));
        c1.add(bNorma);
        c1.add(Box.createHorizontalStrut(4));
        c1.add(bConjugada);

        c2.add(Box.createHorizontalStrut(115));
        c2.add(lCom);
        c2.add(Box.createVerticalStrut(10));
        c2.add(lRes1);
        c2.add(Box.createVerticalStrut(10));
        c2.add(lRes2);
        c2.add(Box.createVerticalStrut(50));

        setLayout(new BorderLayout(10, 15));
        add(p1, BorderLayout.NORTH);
        add(c1, BorderLayout.CENTER);
        add(c2, BorderLayout.SOUTH);

        bSuma.addActionListener(this);
        bSuma.setActionCommand("sumar");

        bResta.addActionListener(this);
        bResta.setActionCommand("restar");

        bMultiplicacion.addActionListener(this);
        bMultiplicacion.setActionCommand("multiplicar");

        bDivision.addActionListener(this);
        bDivision.setActionCommand("dividir");

        bConjugada.addActionListener(this);
        bConjugada.setActionCommand("conjugar");

        bNorma.addActionListener(this);
        bNorma.setActionCommand("norma");

    }

    public void actionPerformed(ActionEvent e) {
        Complejo comp = new Complejo();
        Complejo comp2 = new Complejo();
        Complejo res = new Complejo();
        comp.setparteReal(Float.parseFloat(tReal1.getText()));
        comp2.setparteReal(Float.parseFloat(tReal2.getText()));
        comp.setparteImaginaria(Float.parseFloat(tImag1.getText()));
        comp2.setparteImaginaria(Float.parseFloat(tImag2.getText()));

        if (e.getActionCommand().equals("restar")) {
            res=comp.resta(comp2);
            lRes1.setText(res.mostrar());
        }
        else if (e.getActionCommand().equals("sumar")) {
            res=comp.suma(comp2);
            lRes1.setText(res.mostrar());
        }

    }
}
