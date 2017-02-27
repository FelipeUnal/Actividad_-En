/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

/**
 *
 * @author Estudiante
 */
public class Commission {
    private int Sales;
    private double Commission;

    public Commission(int Sales, double Commission) {
        this.Sales = Sales;
        this.Commission = Commission;
    }

    Commission() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getSales() {
        return Sales;
    }

    public double getCommission() {
        return Commission;
    }

    public void setSales(int Sales) {
        this.Sales = Sales;
    }

    public void setCommission(double Commission) {
        this.Commission = Commission;
    }
    
    public void computeCommission(int Sales, double Commission){
        double c = Commission*Sales;
    }
    public void computeCommission(int Sales){
        double c = Sales*0.075;
    }
    
    
}
