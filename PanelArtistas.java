package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelArtistas extends JPanel implements ActionListener {

    JButton botonCargar;
    JButton botonGuardar;
    JButton botonCancelar;
    JButton botonSalir;

     public  PanelArtistas(     )
     {
         setLayout(null);
         botonCargar = new JButton("Cargar nombre");
         botonGuardar = new JButton("Guardar nombre");
         botonGuardar.addActionListener(this);
         botonCancelar = new JButton("Cancelar");
         botonSalir = new JButton("Salir");
     }

    @Override
    public void actionPerformed(ActionEvent e) {

         String command = e.getActionCommand();
         switch(command)
         {
             case "Cargar":
                 System.out.println("Cargar");
                 break;
             case "Guardar":
                 System.out.println("Guardar");
                 break;
             case "Cancelar":
                 System.out.println("Cancelar");
                 break;
             case "Salir":
                 System.out.println("Salir");
                 break;
         }

    }
}
