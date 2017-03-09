/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.Classes;

import br.com.satc.personagens.Personagem;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }

    public void FlechaDeFogo(){
        // Debuff : "Burn" - Queima ao iniciar um turno.
        // Duração do Debuff : 3 turnos.
        // Dano do Debuff : 10% do dano causado no hit ao usar a skill.
        // CDR : 7 turnos.
        // Dano Base da Skill : 50.
    }
    
    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
