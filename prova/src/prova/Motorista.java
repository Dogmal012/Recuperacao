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
public  class Motorista extends Funcionario{
    
    private String carteiraDeHabilitacao;

    public Motorista(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Motorista{" + "carteiraDeHabilitacao=" + carteiraDeHabilitacao + '}';
    }
    
    

   
    
    
    
}
