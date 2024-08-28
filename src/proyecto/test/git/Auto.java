/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.test.git;

/**
 *
 * @author jere
 * @Version 28-08
 */
public class Auto {
    
    private String marca,modelo,color,tipoTransmision,tipoCombustible;
    private int año, cant_puertas;
    private double cilindrada;

    public Auto() {
        
        marca = "Tesla";
        modelo = "S";
        
    }

    public Auto(String marca, String modelo, String color, String tipoTransmision, String tipoCombustible, int año, int cant_puertas, double cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoTransmision = tipoTransmision;
        this.tipoCombustible = tipoCombustible;
        this.año = año;
        this.cant_puertas = cant_puertas;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override // Sobre escribir - herencia
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipoTransmision=" + tipoTransmision + ", tipoCombustible=" + tipoCombustible + ", a\u00f1o=" + año + ", cant_puertas=" + cant_puertas + ", cilindrada=" + cilindrada + '}';
    
    }
    
    public static void main(String[] args) {
    
        Auto objAuto1 = new Auto();
        System.out.println("Marca: " + objAuto1.getMarca());
        System.out.println("Modelo: " + objAuto1.getModelo());
        
        System.out.println(objAuto1.toString());
        
        objAuto1.setModelo("yaris");
        System.out.println("Marca: " + objAuto1.getMarca());
        System.out.println("Modelo: " + objAuto1.getModelo());
        Auto objAuto2 = new Auto("VW", "Escarabajo", "Amarillo", "Mecanica", "Bencinero", 1981, 2, 1500);
        System.out.println("");
        System.out.println("Marca: " + objAuto2.getMarca());
        System.out.println("Modelo: " + objAuto2.getModelo());
        
        System.out.println(objAuto2.toString());       
    }
    
}
