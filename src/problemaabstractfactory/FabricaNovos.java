/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemaabstractfactory;

/**
 *
 * @author lizz
 */
class FabricaNovos implements Modelo {

    @Override
    public Esports getEsports() {
        return new Fifa();
    }

    @Override
    public Rpg getRpg() {

        return new BaldursGate3();
    }

}
