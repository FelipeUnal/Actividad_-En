/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;

/**
 *
 * @author Estudiante
 */
public class Pizza {
    
    private String Ingredientes;
    private double Diametro;
    private double Price;

    public Pizza(String Ingredientes, double Diametro, double Price) {
        this.Ingredientes = Ingredientes;
        this.Diametro = Diametro;
        this.Price = Price;
    }

    Pizza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIngredientes(String Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public void setDiametro(double Diametro) {
        this.Diametro = Diametro;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getIngredientes(){
        return Ingredientes;
    }

    public double getDiametro() {
        return Diametro;
    }

    public double getPrice() {
        return Price;
    }

    void setToppie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
