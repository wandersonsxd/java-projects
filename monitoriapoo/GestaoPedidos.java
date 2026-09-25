package monitoriapoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

public class GestaoPedidos {
    private ArrayList<String> pedidos;

    public GestaoPedidos() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String item) {
        pedidos.add(item);
    }

    public String proximoPedido() {
        if (pedidos.isEmpty()) {
            return "Fila Vazia";
        }
        return pedidos.remove(0);
    }

    public int quantidadePendentes() {
        return pedidos.size();
    }

    public void listarPedidos() {
        for (String pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    public static void main(String[] args) {
        GestaoPedidos gestao = new GestaoPedidos();
        gestao.adicionarPedido("X-Burguer");
        gestao.adicionarPedido("Suco de Laranja");
        gestao.adicionarPedido("Batata Frita");

        System.out.println("Removido: " + gestao.proximoPedido());
        System.out.println("Pedidos restantes: " + gestao.quantidadePendentes());
        gestao.listarPedidos();
    }
}
