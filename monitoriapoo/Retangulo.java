package monitoriapoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 1.0;
        this.altura = 1.0;
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double calcularArea() {
        return largura * altura;
    }

    public boolean isQuadrado() {
        return largura == altura;
    }

    public static void main(String[] args) {
        Retangulo r = new Retangulo(5, 5);
        System.out.println("É quadrado? " + r.isQuadrado());
        System.out.println("Área: " + r.calcularArea());
    }
}  

