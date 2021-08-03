package com.misiontic.main;

import java.awt.Color;
/*public class Animal {
    
    float peso;//peso ideal de  4kg
    int felicidad;//va de 0 a 100, 0 es triste; 100 es feliz.
    int salud;//va de 0 a 100, 0 muerto, 100 muy saludable.
    int hambre;//va de 0 a 100, 0 es sin hambre y 100 es famelico.
    int sueno; //va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
    
    //Tengo que dar una respuesta cuando termine de comer?
    //Yo quiero decir si ya termine de comer
    private void comer() {
        if(hambre <= 5) {
            hambre = 0;
            System.out.println("Estoy demasiado lleno, me voy a enfermar de tanto comer");
            salud = salud -2;
            peso +=2;
            sueno += 2;
            felicidad -= 3;
           /* if(salud <0) {
            	salud =0;
            	System.out.println("Me estoy muriendo!");
            }
            if (peso > 4) {
            	salud -=1;
            	System.out.println("Debo hacer ejercicio!");
            }
            if(sueno >= 80) {
            	salud -=1;
            	System.out.println("Debo dormir un rato");
            }
            if(felicidad < 50) {
            	salud -=1;
            	System.out.println();
            }
            
        }else {
            hambre = hambre - 5;
            peso +=1;
            felicidad += 3;
            sueno += 3;
            salud += 3;
        }
    }
    private void dormir() {
    	if(sueno <= 5) {
    		sueno = 0;
    		System.out.println("He dormido más que suficiente!");
    		salud -=1;
    		peso +=1;
    	}else {
    		sueno -=5;
    		peso +=1;
    	}
        
    }
    private void ejercitar() {
    	if(peso > 4) {
    		salud -=1;
    		felicidad -= 2;
    		if (salud<0) {
    			salud =0;
    		}
    		
    		System.out.println("Debo seguir haciendo ejercicio hasta llegar a 4kg!");
    		peso -= 1;
    		
    	}else if(peso >3.5 && peso<=4) {
    		salud +=2;
    		felicidad += 2;
    		System.out.println("Es suficiente ejercicio por ahora");
    	}
        
    }
    public int jugar() {
    	if(felicidad <50) {
    		salud -= 1;
    		felicidad +=2;
    		System.out.println("Necesito jugar para sentirme mejor!");
    	}else {
    		System.out.println("He jugado suficiente");
    		salud += 1;
    		
    	}
    	return felicidad;
        
    }
*/

public class Animal {
	
	float weight;
	int happiness;//va de 0 a 100, 0 es triste; 100 es feliz.
	int health;//va de 0 a 100, 0 muerto, 100 muy saludable.
	int hungry;//va de 0 a 100, 0 es sin hambre y 100 es famelico.
	int sleep; //va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
	boolean awake;
	
	//Tengo que dar una respuesta cuando termine de comer?
	//Yo quiero decir si ya termine de comer
	public void eat(Food food) {
		weight = weight + 2;
		if(hungry <= food.calories) {
			hungry = 0;
			System.out.println("Estoy demasiado lleno, me voy a enfermar de tanto comer");
			health = health -2;			
		}else {
			hungry = hungry - food.calories;
		}
	}
	private void eat() {
		sleep = 100;
		health = health + 1;
	}

	private void makeExercise() {
		happiness = happiness + 1;
		hungry = hungry + 10;
		health = health + 3;
		weight = weight - 1;
		sleep = sleep + 5;
		
	}
	private void play() {
		sleep = sleep + 5;
		happiness = happiness + 5;
		hungry = hungry + 5;
	}


}

