package com.matheus.java;

public class Historico {

    private String[] historico = new String [3];
    private int i;

    void apresentaHistorico(){
        if (historico != null){
            for (i=0; i<historico.length; i++){
                System.out.println(" " +historico[i]);
            }
        }
        else {
            System.out.println("Historico esta vazio");
        }
    }

    public void setHistorico(String[] historico) {
        this.historico = historico;
    }
}
