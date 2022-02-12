/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author Mariel Mata <mlmtcrdn@gmail.com>
 */
public class RecetaClase {
    String titulo;
    String ingredientes;
    String utensilios;
    String procedimiento;
    String img;

    public RecetaClase() {
    }

    public RecetaClase(String titulo, String ingredientes, String utensilios, String procedimiento, String img) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.utensilios = utensilios;
        this.procedimiento = procedimiento;
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(String utensilios) {
        this.utensilios = utensilios;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
