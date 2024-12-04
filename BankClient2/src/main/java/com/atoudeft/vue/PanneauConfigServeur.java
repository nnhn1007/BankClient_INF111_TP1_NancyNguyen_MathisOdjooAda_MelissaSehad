package com.atoudeft.vue;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * @version 1.0
 * @since 2023-11-01
 */
public class PanneauConfigServeur extends JPanel {
    private JTextField txtAdrServeur, txtNumPort;

    /**
     * Question 1.2 - Nancy Nguyen
     * Constructeur par paramètres de la classe PanneauConfigServeur
     * Initialise les champs de texte pour l'adresse  IP et le port d'écoute du serveur
     * @param adr adresse IP
     * @param port Port d'écoute du serveur
     */
    public PanneauConfigServeur(String adr, int port) {
        //1.Configuration du panneau
        setLayout(new GridLayout(2,2, 0, 10));

        //2.txtAdrServeur: Définition du champ de texte et des valeurs initiales
        txtAdrServeur = new JTextField();
        txtAdrServeur.setPreferredSize(new Dimension(175,10));
        txtAdrServeur.setText(adr); //Afficher l'adresse IP

        //3.txtNumPort: Définition du champ de texte et des valeurs initiales
        txtNumPort = new JTextField();
        txtNumPort.setPreferredSize(new Dimension(175,10));
        txtNumPort.setText(String.valueOf(port)); //Afficher le port

        //4. Adresse IP: Ajout étiquette et des champ de texte
        JLabel lblTxtAdrServeur = new JLabel();
        add(new JLabel("Adresse IP: ", SwingConstants.RIGHT));
        lblTxtAdrServeur.setPreferredSize(new Dimension(50,10));
        add(txtAdrServeur);

        //5. Port: Ajout étiquette et des champ de texte
        JLabel lblTxtNumPort = new JLabel();
        add(new JLabel("Port: ", SwingConstants.RIGHT));
        lblTxtNumPort.setPreferredSize(new Dimension(50,10));
        add(txtNumPort);
    }

    public String getAdresseServeur() { return txtAdrServeur.getText(); }
    public String getPortServeur() {return txtNumPort.getText();
    }
}
