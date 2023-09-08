/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemaabstractfactory;

import java.util.Scanner;

/**
 *
 * @author lizz
 */
public class ProblemaAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Informe 1- Jogos Novos ou 2- Jogos antigos");
       byte opc = sc.nextByte();
       
       Modelo modelo = null;
       switch (opc) {
        case 1: modelo = new FabricaNovos(); break;
        case 2: modelo = new FabricaAntigos(); break;
    }
       
      SugestaoGame sugestao = new SugestaoGame(modelo);
      sugestao.gerar(opc);
       System.out.println("Esportes " + sugestao.getGameEsporte().toString());
       System.out.println("Rpg " + sugestao.getGameRpg().toString());
    }
    
}
