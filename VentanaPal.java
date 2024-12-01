package UI;

import javax.swing.*;
import java.awt.*;

public class VentanaPal extends JFrame {

    PanelPlaylists panelPlaylists;

    public VentanaPal() {
        panelPlaylists = new PanelPlaylists();
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("PAL");
    }
}
