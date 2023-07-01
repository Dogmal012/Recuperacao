/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario{
    
    private String oab;

    public Advogado(String oab) {
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Advogado{" + "oab=" + oab + '}';
    }
    
    
    
    
}
