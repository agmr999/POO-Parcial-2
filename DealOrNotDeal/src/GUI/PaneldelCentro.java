package GUI;

import javax.swing.*;
import java.awt.*;



public class PaneldelCentro extends JPanel {

    private JButton botondeJugar;
    private Image imagen;


    public PaneldelCentro(){
        super.setVisible(true);
        super.setLayout(new BorderLayout());
        super.setPreferredSize(new Dimension(100,50));
        super.setBackground(Color.lightGray);

         preinit();
        initcomponents();


    }

    private void initcomponents() {
    }

    private void preinit(){
        imagen = new ImageIcon("/home/abnermr/Documentos/Karimnot/DealOrNotDeal/src/Images/DealornotDeal.jpeg").getImage();
    }

    public void paint(Graphics g){
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
    }



}
