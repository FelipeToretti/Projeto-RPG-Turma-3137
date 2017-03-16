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
public class Druida extends Personagem {
    
      @Override
    public void setVelocidadeMovimento(int velocidadeMovimento) {
        super.setVelocidadeMovimento(velocidadeMovimento+340);
    }

    @Override
    public void setHp(int vitalidade) {
        super.setHp(vitalidade+250); 
    }
    
    @Override
    public void setMultiSP(int multiSP) {
        super.setMultiSP(multiSP+500);
    }

    @Override
    public void setCarga(int forca) {
        super.setCarga(forca+0); 
    }

    @Override
    public void setVelocidadeAtaque(int velocidadeAtaque) {
        super.setVelocidadeAtaque(velocidadeAtaque+3);
    }

    @Override
    public void setDefesa(int vitalidade) {
        super.setDefesa(vitalidade+5);
    }
    
    @Override
    public void setDefesaMagica(int inteligencia) {
        super.setDefesaMagica(inteligencia+20); 
    }

    @Override
    public void setAtaque(int forca) {
        super.setAtaque(forca+60); 
    }

    @Override
    public void setAtaqueMagico(int inteligencia) {
        super.setAtaqueMagico(inteligencia+80);
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

    public Druida(String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }
    
    public void EsferaElemental(){
        //Skill Ativa.
        //Efeito : Druida lança uma esfera de um tipo de elemento causando dano ao inimigo.
        //Tipo de Efeito : Dependendo da sua raça o elemento e efeito mudam.
        //Elementos :Humano(Esfera de Terra), Elfo Noturno(Esfera De Escuridão), Elfo Sangrento(Multiplas esferas de Vento), Tauren(Esfera de Pedra).
        //Dano : EdTerra_100/150/200, EdEscuridão_120/180/220, EdVento_70/90/120-Numero de esferas_ 1/2/4, EdPedra_90/140/190.
        //Efeito EdTerra : Ignora 10%/20%/30% do escudo magico do inimigo.
        //Efeito EdEscuridão : Aplica um Debuff de escuridão que aumenta em 10%/20%/30% o dano magico aplicado no inimigo.
        //Efeito EdVento : Efeito passivo.Chance de critar esferas ou skills alternativas em 10%/20%/30%.
        //Efeito EdPedra : Stuna o inimigo em 1/2/4 turnos.
    }
    @Override
    public void atacar(int Dano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
