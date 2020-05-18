package claseMain;

import java.util.Random;

public class Paladin extends Clases {

    public Paladin() {//Constructores vacios y super
        super();
    }
    public Paladin(int vida, int daño, int defensa, int energia, int evasion, int critico) {
        super( vida, daño, defensa, energia,evasion, critico);
    }
    //ESTADISTICAS
    public void paladinStats() {
        this.vida = 120;
        this.daño = 25;
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
        juicio = daño * 2;
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
        veredicto = daño *3;
        energia = energia - 200;
        return veredicto;
    }
    
    // presentacion
    
    public String toString() {
    	return "Has elegido el Paladín que cuenta con " + vida +
    			" tiene un daño de " + daño + " además tiene " + energia +
    			" PM, además cuenta con " + defensa + " puntos de defensa." ;
    }
    
    public String statsPaladin() {
    	return "Vida: " + vida +
    			" PM: " + energia;
    }
    //getters
    public int getVida() {
    	return vida;
    }
    public int getDaño() {
    	return daño;
    }
    public int getDefensa() {
    	return defensa;
    }
    //setters
    public void setVida(int vida) {
    	this.vida = vida;
    }
    public void setDaño(int daño) {
    	this.daño = daño;
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
