package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelCanciones extends JPanel implements ActionListener {

    JButton botonCargar;
    JButton botonGuardar;
    JButton botonCancelar;
    JButton botonSalir;

    public PanelCanciones()
    {
        setLayout(null);
        botonCargar = new JButton("Cargar Canciones");
        botonGuardar = new JButton("Guardar");
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
