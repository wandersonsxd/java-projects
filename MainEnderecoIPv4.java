/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooModulo01.Revisao.Mains;

import PooModulo01.Revisao.Questoes01.EnderecoIPv4;



/**
 *
 * @author Wanderson
 */
public class MainEnderecoIPv4 {
    public static void main(String[] args) {
        EnderecoIPv4 ip1 = new EnderecoIPv4();               // loopback 127.0.0.1
        EnderecoIPv4 ip2 = new EnderecoIPv4(192, 168, 0, 1);
        EnderecoIPv4 ip3 = new EnderecoIPv4(10, 0, 0, 300);  // inválido (300 > 255)

        System.out.println("ip1: " + ip1.formata() + " | válido: " + ip1.valida() + " | classe: " + ip1.getClasse());
        System.out.println("ip2: " + ip2.formata() + " | válido: " + ip2.valida() + " | classe: " + ip2.getClasse());
        System.out.println("ip3: " + ip3.formata() + " | válido: " + ip3.valida() + " | classe: " + ip3.getClasse());

        System.out.println("compara(ip2, ip1): " + ip2.compara(ip1));
        System.out.println("compara(ip1, ip2): " + ip1.compara(ip2));

        ip1.setOcteto1(200);
        System.out.println("ip1 após setOcteto1(200): " + ip1.formata() + " | classe: " + ip1.getClasse());
    }
}
