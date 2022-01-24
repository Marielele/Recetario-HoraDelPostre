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
    private String nombre;
    private String ingredientes;
    private String utensilios;
    private String procedimiento;
    private String imagen;

    public RecetaClase() {
    }

    public RecetaClase(String nombre, String ingredientes, String utensilios, String procedimiento, String imagen) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.utensilios = utensilios;
        this.procedimiento = procedimiento;
        this.imagen = imagen;
    }
        public RecetaClase(String nombre, String ingredientes, String utensilios, String procedimiento) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.utensilios = utensilios;
        this.procedimiento = procedimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
