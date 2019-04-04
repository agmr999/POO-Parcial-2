package GUI;

import javax.swing.*;
import javax.swing.text.Utilities;

public class MainDeal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DealFrame juego = new DealFrame();
            }
        });
    }
}
