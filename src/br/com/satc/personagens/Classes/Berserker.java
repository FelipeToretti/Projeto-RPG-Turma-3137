/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.Classes;

import br.com.satc.personagens.Personagem;

/**
 *
 * @author Edutec
 */
public class Berserker extends Personagem {
    
    

    @Override
    public void setVelocidadeMovimento(int velocidadeMovimento) {
        super.setVelocidadeMovimento(velocidadeMovimento+300);
    }

    @Override
    public void setHp(int vitalidade) {
        super.setHp(vitalidade+500); 
    }
    
    @Override
    public void setMultiSP(int multiSP) {
        super.setMultiSP(multiSP+250);
    }

    @Override
    public void setCarga(int forca) {
        super.setCarga(forca+15); 
    }

    @Override
    public void setVelocidadeAtaque(int velocidadeAtaque) {
        super.setVelocidadeAtaque(velocidadeAtaque+5);
    }

    @Override
    public void setDefesa(int vitalidade) {
        super.setDefesa(vitalidade+10);
    }
    
    @Override
    public void setDefesaMagica(int inteligencia) {
        super.setDefesaMagica(inteligencia+10); 
    }

    @Override
    public void setAtaque(int forca) {
        super.setAtaque(forca+50); 
    }

    @Override
    public void setAtaqueMagico(int inteligencia) {
        super.setAtaqueMagico(inteligencia+0);
    }

    @Override
    public void setEsquiva(int agilidade) {
        super.setEsquiva(agilidade+0); 
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
    
    public Berserker(String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }
    
    public void AtaquePesado() {
        // Skill Ativa.
        // Efeito : Berseker da um ataque pesado stunando o inimigo por 2/4/6 Turnos.
        // Dano base : 50+AA.
        // Mana : 100/120/150. 
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
