/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finstere;

/**
 *
 * @author nK_BlaZy
 */
public class Sang extends Pion {
    /* Type de flaque de sang (carré, linéaire v/h) */
    private String type;
    
    public Sang(int _x, int _y, String _type) {
        super(_x, _y);
        this.type = _type;
    }
}
