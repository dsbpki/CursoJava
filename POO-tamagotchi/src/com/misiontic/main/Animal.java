package com.misiontic.main;

import java.awt.Color;


public class Animal {
	
	private float weight;
	private int happiness;//va de 0 a 100, 0 es triste; 100 es feliz.
	private int health;//va de 0 a 100, 0 muerto, 100 muy saludable.
	private int hungry;//va de 0 a 100, 0 es sin hambre y 100 es famelico.
	private int sleep; //va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
	private boolean awake;
	
	
	
	
	public Animal(float weight, int happiness) {// Este constructor obliga al usuario a dale valores a weight y happiness
		this( weight, happiness, 0);// con el this hace referencia al siguiente constructor, le entrega los parametros
		// que le llegan al siguiente constructor e inicializa el otro parametro en 0(health)
		this.weight = weight;
		this.happiness = happiness;
		
	}
	
	public Animal(float weight, int happiness, int health) {
		this(weight, happiness, health,0);
		this.weight = weight;
		this.happiness = happiness;
		this.health = health;
	}
	

	public Animal(float weight, int happiness, int health, int hungry) {
		this(weight, happiness, health, hungry, 0,false);
		this.weight = weight;
		this.happiness = happiness;
		this.health = health;
		this.hungry = hungry;
	}
	

	public Animal(float weight, int happiness, int health, int hungry, int sleep, boolean awake) {
		super();// Este constructor es el ultimo llamado, quien inicializa todas las variables, ya sean obligadas
		// siendo el caso que se utiliza este constructor, o si es de los primeros, inicializa los otros
		// atributos con valores por defecto, ya sea en 0 o falso
		this.weight = weight;
		this.happiness = happiness;
		this.health = health;
		this.hungry = hungry;
		this.sleep = sleep;
		this.awake = awake;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHungry() {
		return hungry;
	}

	public void setHungry(int hungry) {
		this.hungry = hungry;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	public boolean isAwake() {
		return awake;
	}

	public void setAwake(boolean awake) {
		this.awake = awake;
	}

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

