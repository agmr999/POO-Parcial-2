import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;


public class Calculadora extends JFrame{
    Caracteres car = new Caracteres();
    private JPanel Encabezado = new JPanel();;
    private JLabel Res = new JLabel();
    private JPanel Cuerpo = new JPanel();
    private JPanel Calcu = new JPanel();
    private JPanel Botones = new JPanel();
    private JButton B1 = new JButton("A");
    private JButton B2 = new JButton("B");
    private JButton B3 = new JButton("C");
    private JButton B4 = new JButton("D");
    private JButton B5 = new JButton("E");
    private JButton B6 = new JButton("F");
    private JButton B7 = new JButton("G");
    private JButton B8 = new JButton("H");
    private JButton B9 = new JButton("I");
    private JButton B10 = new JButton("J");
    private JButton B23 = new JButton("V");
    private JButton B24 = new JButton("W");
    private JButton B25 = new JButton("X");
    private JButton B26 = new JButton("Y");
    private JButton B27 = new JButton("Z");
    private JButton BM = new JButton("+");
    private JButton BMe = new JButton("-");
    private JButton BMu = new JButton("x");
    private JButton BD = new JButton("/");
    private JButton BEx = new JButton("^");
    private JButton BPA = new JButton("(");
    private JButton BPC = new JButton(")");
    private JButton Resolver = new JButton("Resolver");
    private JButton C = new JButton("CE");

    public Calculadora(){
        super("Calculadora");
        super.setSize(300, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        super.setVisible(true);

        Encabezado.setBackground(Color.WHITE);
        super.add(Encabezado,BorderLayout.NORTH);
        Encabezado.add(Res);
        super.add(Cuerpo, BorderLayout.CENTER);
        Calcu.setPreferredSize(new Dimension(120,50));
        super.add(Calcu, BorderLayout.EAST);
        super.add(Botones, BorderLayout.SOUTH);

        B1.setBackground(Color.WHITE);
        B1.setPreferredSize(new Dimension(50,40));
        B2.setBackground(Color.WHITE);
        B2.setPreferredSize(new Dimension(50,40));
        B3.setBackground(Color.WHITE);
        B3.setPreferredSize(new Dimension(50,40));
        B4.setBackground(Color.WHITE);
        B4.setPreferredSize(new Dimension(50,40));
        B5.setBackground(Color.WHITE);
        B5.setPreferredSize(new Dimension(50,40));
        B6.setBackground(Color.WHITE);
        B6.setPreferredSize(new Dimension(50,40));
        B7.setBackground(Color.WHITE);
        B7.setPreferredSize(new Dimension(50,40));
        B8.setBackground(Color.WHITE);
        B8.setPreferredSize(new Dimension(50,40));
        B9.setBackground(Color.WHITE);
        B9.setPreferredSize(new Dimension(50,40));
        B10.setBackground(Color.WHITE);
        B10.setPreferredSize(new Dimension(50,45));
        B23.setBackground(Color.WHITE);
        B23.setPreferredSize(new Dimension(50,45));
        B24.setBackground(Color.WHITE);
        B24.setPreferredSize(new Dimension(50,45));
        B25.setBackground(Color.WHITE);
        B25.setPreferredSize(new Dimension(50,45));
        B26.setBackground(Color.WHITE);
        B26.setPreferredSize(new Dimension(50,45));
        B27.setBackground(Color.WHITE);
        B27.setPreferredSize(new Dimension(50,45));

        C.setBackground(Color.RED);
        C.setPreferredSize(new Dimension(55,45));
        BM.setPreferredSize(new Dimension(45,45));
        BMe.setPreferredSize(new Dimension(45,45));
        BMu.setPreferredSize(new Dimension(45,45));
        BD.setPreferredSize(new Dimension(45,45));
        BEx.setPreferredSize(new Dimension(45,45));
        BPA.setPreferredSize(new Dimension(45,45));
        BPC.setPreferredSize(new Dimension(45,45));

        B1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('A');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('B');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });
        
        B3.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('C');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B4.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('D');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B5.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('E');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B6.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('F');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B7.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('G');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B8.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('H');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B9.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('I');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B10.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('J');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B23.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('V');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B24.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('W');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B25.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('X');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B26.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('Y');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        B27.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('Z');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        BM.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                car.add('+');
                }catch (PrimersignoExcepcion ex){
                    Primer(ex);
                }catch (SignosPegadosExcepcion ex){
                    Pegados(ex);
                }
                Res.setText(car.Getstring());
                
                }
        });

        BMe.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('-');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        BMu.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('*');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        BD.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('/');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        BEx.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('^');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        BPA.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add('(');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        BPC.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{    
                    car.add(')');
                    }catch (PrimersignoExcepcion ex){
                        Primer(ex);
                    }catch (SignosPegadosExcepcion ex){
                        Pegados(ex);
                    }
                    Res.setText(car.Getstring());
                }
        });

        C.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                    car.remove();
                    Res.setText(car.Getstring());
                }
        });

        Resolver.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.out.println(car.Getstring());
                    car.Polaca();
                    Res.setText(car.Getcola());
                    car.Reset();
                }
        });        

        Cuerpo.add(B1);Cuerpo.add(B2);Cuerpo.add(B3);Cuerpo.add(B4);Cuerpo.add(B5);Cuerpo.add(B6);
        Cuerpo.add(B7);Cuerpo.add(B8);Cuerpo.add(B9);Cuerpo.add(B10);
        Cuerpo.add(B23);Cuerpo.add(B24);Cuerpo.add(B25);Cuerpo.add(B26);Cuerpo.add(B27);

        Calcu.add(C);Calcu.add(BM);Calcu.add(BMe);Calcu.add(BMu);Calcu.add(BD);Calcu.add(BEx);Calcu.add(BPA);Calcu.add(BPC);
        Calcu.add(Resolver);

    }

    public void Primer(PrimersignoExcepcion ex){
        JOptionPane.showMessageDialog(this, "No puedes iniciar con un signo", "Error", JOptionPane.ERROR_MESSAGE);
    } 

    public void Pegados(SignosPegadosExcepcion ex){
        JOptionPane.showMessageDialog(this, "No puede haber un signo seguido de otro signo", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

