/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooModulo01.Revisao.Questoes01;

/**
 *
 * @author Wanderson
 */
public class EnderecoIPv4 {
    private int octeto1;
    private int octeto2;
    private int octeto3;
    private int octeto4;

    public EnderecoIPv4() {                 // loopback padrão
        this.octeto1 = 127;
        this.octeto2 = 0;
        this.octeto3 = 0;
        this.octeto4 = 1;
    }

    public EnderecoIPv4(int octeto1, int octeto2, int octeto3, int octeto4) {
        this.octeto1 = octeto1;
        this.octeto2 = octeto2;
        this.octeto3 = octeto3;
        this.octeto4 = octeto4;
    }

    public int getOcteto1() { return octeto1; }
    public void setOcteto1(int octeto1) { this.octeto1 = octeto1; }
    public int getOcteto2() { return octeto2; }
    public void setOcteto2(int octeto2) { this.octeto2 = octeto2; }
    public int getOcteto3() { return octeto3; }
    public void setOcteto3(int octeto3) { this.octeto3 = octeto3; }
    public int getOcteto4() { return octeto4; }
    public void setOcteto4(int octeto4) { this.octeto4 = octeto4; }

    public boolean valida() {
        return octeto1 >= 0 && octeto1 <= 255
            && octeto2 >= 0 && octeto2 <= 255
            && octeto3 >= 0 && octeto3 <= 255
            && octeto4 >= 0 && octeto4 <= 255;
    }

    public char getClasse() {
        if (!valida() || octeto1 == 0 || octeto1 == 127) return 'X';
        if (octeto1 <= 126) return 'A';
        if (octeto1 <= 191) return 'B';
        if (octeto1 <= 223) return 'C';
        if (octeto1 <= 239) return 'D';
        return 'E';
    }

    public String formata() {
        if (!valida()) return "Endereço IPv4 Inválido!";
        return octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4;
    }

    public int compara(EnderecoIPv4 outroIp) {
        if (this.octeto1 != outroIp.octeto1) return this.octeto1 > outroIp.octeto1 ? 1 : -1;
        if (this.octeto2 != outroIp.octeto2) return this.octeto2 > outroIp.octeto2 ? 1 : -1;
        if (this.octeto3 != outroIp.octeto3) return this.octeto3 > outroIp.octeto3 ? 1 : -1;
        if (this.octeto4 != outroIp.octeto4) return this.octeto4 > outroIp.octeto4 ? 1 : -1;
        return 0;
    }
}

