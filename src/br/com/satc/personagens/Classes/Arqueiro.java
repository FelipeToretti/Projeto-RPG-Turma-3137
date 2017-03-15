/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.Classes;

import br.com.satc.personagens.Personagem;

public class Arqueiro extends Personagem {

    @Override
    public void setVelocidadeMovimento(int velocidadeMovimento) {
        super.setVelocidadeMovimento(350); 
    }

    @Override
    public void setHp(int vitalidade) {
        super.setHp(vitalidade+300);
    }

    @Override
    public void setSp(int inteligencia) {
        super.setSp(inteligencia+200);
    }
    
    @Override
    public void setCarga(int forca) {
        super.setCarga(forca+10);
    }

    @Override
    public void setVelocidadeAtaque(int velocidadeAtaque) {
        super.setVelocidadeAtaque(velocidadeAtaque+10); 
    }

    @Override
    public void setDefesa(int vitalidade) {
        super.setDefesa(vitalidade+7);
    }
    
    @Override
    public void setDefesaMagica(int inteligencia) {
    super.setDefesa(inteligencia+5);
    }
    @Override
    
    public void setAtaque(int forca) {
        super.setAtaque(forca+65);
    }

    @Override
    public void setAtaqueMagico(int inteligencia) {
        super.setAtaqueMagico(inteligencia+0);
    }

    @Override
    public void setEsquiva(int agilidade) {
        super.setEsquiva(agilidade+10);
    }

    @Override
    public void setEsquivaSorte(int sorte) {
        super.setEsquivaSorte(sorte+10);
    }
    
    @Override
    public void setCritico(int sorte) {
        super.setCritico(sorte+0);
    }

    @Override
    public void setPrecisao(int destreza) {
        super.setPrecisao(destreza+0);
    }

    public Arqueiro(String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }

    
    
    public void FlechaArdente(){
        // Skill Ativa.
        // Debuff : "Burn" - Queima ao iniciar um turno.
        // Duração do Debuff : 3 turnos.
        // Dano do Debuff : 10% do dano causado no hit ao usar a skill.
        // CDR : 7 turnos.
        // Dano Base da Skill : 50.
        // Mana : 85.
    }
    
    public void AljavaBeneficiente(){
        // Skill Passiva.
        // Efeito : Aumenta a chance de efetuar múltiplos ataques em um turno. (Máximo : 3)
        // Chance do Efeito : 30%,15%,5%.
        // Dano : O dano das flechas extras será sempre a metade do dano da flecha antecedente.
        // Observação : A cada flecha extra, a chance de disparar outra flecha será a metade da chance antecedente.
    }
    
    public void EscudoEvasivo(){
        // Skill Ativa.
        // Buff : Aumenta a chance de esquiva em 30%
        // Duração do Buff : 3 turnos.
        // CDR : 9 turnos.
        // Mana : 100.
    }
   
   //eae 
    
    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
