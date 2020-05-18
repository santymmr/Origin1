package claseMain;

import java.util.Random;

public class Arquero extends Clases {

    public Arquero() { // constructores vacios y super
        super(); // pasar los valores al super ().
        this.vida = 80;
        this.daño = 20 ;
        this.energia = 400;
        this.defensa = 26;
        this.critico = 1;
        this.evasion = 1;
    }
    public Arquero(int vida, int daño, int defensa, int energia, int evasion, int critico) {
        super(vida, daño, defensa, energia, evasion, critico);

    }
    //ESTADISTICAS
    public void arqueroStats() {
        this.vida = 80;
        this.daño = 50 ;
        this.energia = 400;
        this.defensa = 26;
        this.critico = 1;
        this.evasion = 1;

    }
    public void arqueroDodge() {

    }

    public void arqueroCrit() {

    }

    //4 HABILIDADES
    public void arqueroLetal() {
        daño = daño + 5;
        energia = energia - 50;
    }
    public int arqueroPowerShot() {
        int shot;
        energia = energia - 40;
        shot = daño - 10;
        return shot;
    }
    public boolean arqueroSalto() {
    	Random r = new Random();
    	energia = energia - 100;
		int Low = 0;
		int High = 100;
		int Result = r.nextInt(High-Low) + Low;
		if (Result <80) {
			return true;
		}else {
			return false;
		}
    }
    public int arqueroDoubleShot() {
    	Random r = new Random();
		int Low = 1;
		int High = 3;
		int Result = r.nextInt(High-Low) + Low;
        if (Result == 2 ) {
            daño = this.daño+(this.daño + 4);
            energia = energia - 60;
        }else {
            daño = this.daño/2;
            energia = energia - 40;
        }
        return daño;
    }
    
    public String toString() {
    	return "Has elegido el Arquero que cuenta con " + vida +
    			" tiene un daño de " + daño + " además tiene " + energia +
    			" PM, además cuenta con " + defensa + " puntos de defensa." ;
    
    }
    public String statsArquero() {
    	return "Vida: " + vida +
    			" PM: " + energia;
    }
    
   //Getters
    public int getVida() {
    	return vida;
    }
    
    public int getDefensa() {
    	return defensa;
    }
    public int getDaño() {
    	return daño;
    }
    //setters
    public void setVida(int vida) {
    	this.vida = vida;
    }
    
    public void setDefensa(int defensa) {
    	this.defensa = defensa;
    }
    //Dado de acierto
    public boolean arqueroDado() {
    	Random r = new Random();
		int Low = 0;
		int High = 100;
		int Result = r.nextInt(High-Low) + Low;
		if (Result <55) {
			return true;
		}else {
			return false;
		}
    }
    public boolean arqueroMuerte() {
    	if (vida <=0 ) {
    		return true;
    	}else {
    		return false;
    	}
    }
  }