package monitoriapoo;


import monitoriapoo.Autor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Livro {
    private String titulo;
    private double preco;
    private Autor autor;

    public Livro(String titulo, double preco, Autor autor) {
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.getNome());
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}