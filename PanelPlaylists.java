package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPlaylists extends JPanel implements ActionListener {

    JButton botonCargar, botonGuardar, botonSalir, botonCancelar;

    public PanelPlaylists() {
        botonCargar = new JButton("Cargar");
        botonCargar.addActionListener(this);

        botonGuardar = new JButton("Guardar");
        botonGuardar.addActionListener(this);

        botonSalir = new JButton("Salir");
        botonSalir.addActionListener(this);

        botonCancelar = new JButton("Cancelar");
        botonCancelar.addActionListener(this);

        this.add(botonCargar);
        this.add(botonGuardar);
        this.add(botonSalir);
        this.add(botonCancelar);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
