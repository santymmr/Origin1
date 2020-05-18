package claseMain;

import java.util.Random;

public class Paladin extends Clases {

    public Paladin() {//Constructores vacios y super
        super();
    }
    public Paladin(int vida, int da�o, int defensa, int energia, int evasion, int critico) {
        super( vida, da�o, defensa, energia,evasion, critico);
    }
    //ESTADISTICAS
    public void paladinStats() {
        this.vida = 120;
        this.da�o = 25;
        this.energia = 300;
        this.defensa = 40;
    }
    public void paladinDodge() {

    }
    public void paladinCrit() {

    }

    //4 HABILIDADES
    public void paladinCura() {
        vida = vida + 50;
        energia = energia - 100;
    }
    public int paladinJuicio() {
        int juicio;
        juicio = da�o * 2;
        energia = energia - 40;
        return juicio;
    }
    public void paladinIronSkin() {
      
        defensa = defensa + 8;
        energia = energia - 50;
    }
    public int paladinVeredicto() {
        vida = vida +30;
        int veredicto;
        veredicto = da�o *3;
        energia = energia - 200;
        return veredicto;
    }
    
    // presentacion
    
    public String toString() {
    	return "Has elegido el Palad�n que cuenta con " + vida +
    			" tiene un da�o de " + da�o + " adem�s tiene " + energia +
    			" PM, adem�s cuenta con " + defensa + " puntos de defensa." ;
    }
    
    public String statsPaladin() {
    	return "Vida: " + vida +
    			" PM: " + energia;
    }
    //getters
    public int getVida() {
    	return vida;
    }
    public int getDa�o() {
    	return da�o;
    }
    public int getDefensa() {
    	return defensa;
    }
    //setters
    public void setVida(int vida) {
    	this.vida = vida;
    }
    public void setDa�o(int da�o) {
    	this.da�o = da�o;
    }
    public void setDefensa(int defensa) {
    	this.defensa = defensa;
    }
    
    public int getEnergia() {
    	return energia;
    }
    
    
    
    //Dado de acierto
    public boolean paladinDado() {
    	Random r = new Random();
		int Low = 0;
		int High = 100;
		int Result = r.nextInt(High-Low) + Low;
		if (Result <61) {
			return true;
		}else {
			return false;
		}
    }
    //derrota
    public boolean paladinMuerte() {
    	if (vida <=0 ) {
    		return true;
    	}else {
    		return false;
    	}
    }
}
