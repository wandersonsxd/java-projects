package monitoriapoo;


import monitoriapoo.Livro;
import monitoriapoo.Autor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Principal {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileira");
        Livro livro = new Livro("Dom Casmurro", 39.90, autor);
        livro.exibirDetalhes();
    }
}
