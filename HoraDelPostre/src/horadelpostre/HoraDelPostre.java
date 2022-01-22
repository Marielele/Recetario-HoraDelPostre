/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadelpostre;

import java.awt.Frame;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import vistas.Inicio;

/**
 *
 * @author Mariel Mata <mlmtcrdn@gmail.com>
 */
public class HoraDelPostre {

    public String carpetaPrincipal = "D:\\Documents\\Recetas_Hora_del_postre";
    public String recetaReciente = "\\Listado.txt";

    public static void main(String[] args) {
//        creaCarpeta();
//        Inicio ini = new Inicio();
//        ini.setVisible(true);
    }

    public void creaCarpeta() {
        File crearCarpeta = new File(carpetaPrincipal);
        File archivoReciente = new File(carpetaPrincipal + recetaReciente);

        if (!crearCarpeta.exists()) {
            crearCarpeta.mkdirs();
        }
        if (!archivoReciente.exists()) {
            try {
                archivoReciente.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(HoraDelPostre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void crearReceta(String nombre, String ingredientes, String utensilios, String procedimento) {
        String nombreCarpeta = "\\" + nombre;
        String aIngredientes = "\\Ingredientes.txt";
        String aUtensilios = "\\Utensilios.txt";
        String aProcedimiento = "\\Procedimiento.txt";
        File nuevaCarpeta = new File(carpetaPrincipal + nombreCarpeta);

        if (!nuevaCarpeta.exists()) {
            nuevaCarpeta.mkdirs();
            try {
                FileWriter nIngredientes = new FileWriter(carpetaPrincipal + nombreCarpeta + aIngredientes);
                nIngredientes.write(ingredientes);
                nIngredientes.close();
                FileWriter nUtensilios = new FileWriter(carpetaPrincipal + nombreCarpeta + aUtensilios);
                nUtensilios.write(utensilios);
                nUtensilios.close();
                FileWriter nProcedimiento = new FileWriter(carpetaPrincipal + nombreCarpeta + aProcedimiento);
                nProcedimiento.write(procedimento);
                nProcedimiento.close();
            } catch (IOException ex) {
                Logger.getLogger(HoraDelPostre.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Receta " + nombre + " creada");
        } else {
            JOptionPane.showMessageDialog(null, "Receta ya existente");
        }
    }

    public void agregarRecetaAListado(String titulo) {
        try {
            FileWriter listado = new FileWriter(carpetaPrincipal + recetaReciente, true);
            listado.write(titulo);
            listado.write("\n");
            listado.close();
        } catch (IOException ex) {
            Logger.getLogger(HoraDelPostre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
