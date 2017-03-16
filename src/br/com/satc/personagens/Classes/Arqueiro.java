/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.Classes;

import br.com.satc.personagens.Personagem;
import java.util.Random;

public class Arqueiro extends Personagem{
        int lvFlechaArd=0, DanoFlechaArd=0, DanoDebuffFlechaArdente=0,CDRFlechaArd;
        int lvAljavaBen=0, DanoAljavaBen=0, ChanceAljavaBen;
        int lvlEscudoEva=0, ChanceEvasao;
        int lvlBodkinArr=0, DanoBodkinArr, PenetracaoBodkinArr, CDRBodkinArr, backDefesa;
        boolean BuffAljavaBen=false;
   

    public int getLvFlechaArd() {
        return lvFlechaArd;
    }

    public void setLvFlechaArd(int lvFlechaArd) {
        this.lvFlechaArd = lvFlechaArd;
    }

    public int getLvAljavaBen() {
        return lvAljavaBen;
    }

    public void setLvAljavaBen(int lvAljavaBen) {
        this.lvAljavaBen = lvAljavaBen;
    }

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
        super.setDefesa(vitalidade+5);
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

    
    public void UparSkill(String nomeSkill){
        switch (nomeSkill){
            case "FlechaArdente":
                lvFlechaArd++;
            case "AljavaBeneficiente":
                lvAljavaBen++;
            case "EscudoEvasivo":
                lvlEscudoEva++;
            case "BodkinArrowhead":
                lvlBodkinArr++;
        }
    }
    
    public void FlechaArdente(){
        switch (lvFlechaArd){
            case 0:
                System.out.println("Você ainda não adquiriu essa skill.");
            case 1:
                DanoFlechaArd=(50+this.getAtaque());
                DanoDebuffFlechaArdente=Math.round((DanoFlechaArd/100)*5);
                this.setSp(this.getSp()-85);
                CDRFlechaArd=7;                
            case 2:
                DanoFlechaArd=(65+this.getAtaque());
                DanoDebuffFlechaArdente=Math.round((DanoFlechaArd/100)*10);
                this.setSp(this.getSp()-100);
                CDRFlechaArd=7;
            case 3:
                DanoFlechaArd=(80+this.getAtaque());
                DanoDebuffFlechaArdente=Math.round((DanoFlechaArd/100)*15);
                this.setSp(this.getSp()-115);
                CDRFlechaArd=7;
                
        }
        
        // Skill Ativa.
        // Debuff : "Burn" - Queima ao iniciar um turno.
        // Duração do Debuff : 3 turnos.
        // Dano do Debuff : 5%/10%/15% do dano causado no hit ao usar a skill.
        // CDR : 7 turnos.
        // Dano Base da Skill : 50/65/80.
        // Mana : 85/100/115.
    }
    
    public void AljavaBeneficiente(){
        ChanceAljavaBen = new Random().nextInt(100);
        
        switch(ChanceAljavaBen){
            case 0:
                 System.out.println("Você ainda não adquiriu essa skill.");
            case 1:
                 if (ChanceAljavaBen<4){
                    atacar(this.getAtaque()/2);
                    atacar((this.getAtaque()/2)/2);
                    atacar((((this.getAtaque()/2)/2)/2));}
                 if (ChanceAljavaBen<9){
                     atacar((this.getAtaque())/2);
                     atacar(((this.getAtaque())/2)/2);}
                 if (ChanceAljavaBen<4){
                     atacar(this.getAtaque()/2);}
                          
            case 2:
                 if (ChanceAljavaBen<9){
                    atacar(this.getAtaque()/2);
                    atacar((this.getAtaque()/2)/2);
                    atacar((((this.getAtaque()/2)/2)/2));}
                 if (ChanceAljavaBen<14){
                     atacar((this.getAtaque())/2);
                     atacar(((this.getAtaque())/2)/2);}
                 if (ChanceAljavaBen<29){
                     atacar(this.getAtaque()/2);}                
            case 3:
                 if (ChanceAljavaBen<14){
                    atacar(this.getAtaque()/2);
                    atacar((this.getAtaque()/2)/2);
                    atacar((((this.getAtaque()/2)/2)/2));}
                 if (ChanceAljavaBen<19){
                     atacar((this.getAtaque())/2);
                     atacar(((this.getAtaque())/2)/2);}
                 if (ChanceAljavaBen<39){
                     atacar(this.getAtaque()/2);}               
        }
        
        // Skill Passiva.
        // Efeito : Aumenta a chance de efetuar múltiplos ataques em um turno. (Máximo : 3).
        // Chance do Efeito : 20%/10%/5%--30%/15%/10%--40%/20%/15%.
        // Dano : O dano das flechas extras será sempre a metade do dano da flecha antecedente.(AAantescedente-50%)
        // Observação : A cada flecha extra, a chance de disparar outra flecha será a metade da chance antecedente.
    }
    
    public void EscudoEvasivo(){
        ChanceEvasao = new Random().nextInt(100);
        switch(ChanceEvasao){
            case 0:
                System.out.println("Você ainda não adquiriu essa skill.");
            case 1:
                if (ChanceEvasao<20){
                    bloquear();
                    }
            case 2:
                if (ChanceEvasao<30){
                    bloquear();
                    }                
            case 3:
                if (ChanceEvasao<40){
                    bloquear();
                    }      
        }
        // Skill Ativa.
        // Buff : Aumenta a chance de esquiva em 20%/30%/40%
        // Duração do Buff : 3 turnos.
        // CDR : 9 turnos.
        // Mana : 100/110/120.
    }
    
    public void BodkinArrowhead (){
        backDefesa = this.getDefesa();
         switch (lvlBodkinArr){
            case 0:
                System.out.println("Você ainda não adquiriu essa skill.");
            case 1:
                DanoBodkinArr=(30+this.getAtaque());
                this.setDefesa((this.getDefesa()/100)*80);
                atacar(DanoBodkinArr);
                this.setSp(this.getSp()-80);
                CDRBodkinArr=7;                
            case 2:
                DanoBodkinArr=(40+this.getAtaque());
                this.setDefesa((this.getDefesa()/100)*70);
                atacar(DanoBodkinArr);
                this.setSp(this.getSp()-80);
                CDRBodkinArr=7;   
            case 3:
                DanoBodkinArr=(50+this.getAtaque());
                this.setDefesa((this.getDefesa()/100)*60);
                atacar(DanoBodkinArr);
                this.setSp(this.getSp()-80);
                CDRBodkinArr=7;   
                
        }
         this.setDefesa(backDefesa);
        // Skill Ativa.
        // Efeito : Atira uma flecha que penetra 20%/30%/40% da armadura do inimigo.
        // Dano Base : 30/40/50+AA.
        // CDR : 7 Turnos.
        // Mana : 80/90/100.
        // Observação : A flecha aplica efeitos de contato(Ex: AljavaBeneficiente, no caso todos os tiros aplicam Armor Pen).
    }
   
   //eae 
    
    @Override
    public void atacar(int Dano) {
        Dano=this.getAtaque();
        
       
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
