/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemaabstractfactory;

/**
 *
 * @author lizz
 */
public class SugestaoGame {

    private Esports gameEsporte;
    private Rpg gameRpg;
    private Modelo fabricaModelo;

    public SugestaoGame(Modelo fabrica){
    
        fabricaModelo = fabrica;
    }
    
    public Esports getGameEsporte() {
        return gameEsporte;
    }

    public Rpg getGameRpg() {
        return gameRpg;
    }

    public void gerar(byte opc) {
        if (opc == 1) {
            gameEsporte = new Fifa();
            gameRpg = new BaldursGate3();
        }

        if (opc == 2) {
            gameEsporte = new WiiGolf();
            gameRpg = new Skyrim();

        }

    }

}
