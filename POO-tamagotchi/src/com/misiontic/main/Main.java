package com.misiontic.main;

public class Main {

	public static void main(String[] args) {


		
/*		Animal gatico = new Animal();
		gatico.hambre = 70;
		gatico.felicidad = 70;
		gatico.peso = 4;
		gatico.salud = 50;
		gatico.sueno = 50;
		
	
		System.out.println("hambre gatico: " + gatico.hambre);		
		System.out.println("felicidad gatico: " + gatico.felicidad);
		System.out.println("peso gatico: " + gatico.peso);
		System.out.println("salud gatico: " + gatico.salud);
		System.out.println("sue�o gatico: " + gatico.sueno);
		
		
		gatico.felicidad = gatico.jugar();
		System.out.println("nueva felicidad gatico: " + gatico.felicidad);
		
*/
		
		/*Animal cat = new Animal();		
		cat.weight = 10;
		cat.happiness = 100;//va de 0 a 100, 0 es triste; 100 es feliz.
		cat.health = 100;//va de 0 a 100, 0 muerto, 100 muy saludable.
		cat.hungry = 0;//va de 0 a 100, 0 es sin hambre y 100 es famelico.
		cat.sleep = 0; //va de 0 a 100, 0 es muy despierto y 100 es muy somnoliento
*/
		Animal perro = new Animal(5, 4, 6, 7, 8, true);
		System.out.println("El perro esta asi de pesado: " + perro.getWeight());
		System.out.println("El perro esta asi de feliz: " + perro.getHappiness());
		System.out.println("El perro esta asi de saludable: " + perro.getHealth());
		System.out.println("El perro esta asi de hambriento: " + perro.getHungry());
		System.out.println("El perro esta asi de dormido: " + perro.getSleep());
		System.out.println("El perro esta asi de despierto: " + perro.isAwake());
		
		Animal cat = new Animal(1,2,3,4,5, true);
		System.out.println("El gato esta asi de pesado: " + cat.getWeight());
		System.out.println("El gato esta asi de feliz: " + cat.getHappiness());
		System.out.println("El gato esta asi de saludable: " + cat.getHealth());
		System.out.println("El gato esta asi de hambriento: " + cat.getHungry());
		System.out.println("El gato esta asi de dormido: " + cat.getSleep());
		System.out.println("El gato esta asi de despierto: " + cat.isAwake());
		
		Food cuido = new Food(800);
		System.out.println("calorias: " + cuido.getCalories());
		System.out.println("name: " + cuido.getFood_name());
	
		
		
		
/*		Veterinary veterinary = new Veterinary();
		Medicine m = veterinary.prescribeMedicine(perro);
		System.out.println("la medicina que me recetan es: " + m.name);
		
		System.out.println("hambre gatico: " + perro.hungry);
		System.out.println(Math.floor((100 - 50)/10));
		System.out.println(Math.ceil(5.25));
*/

	}

}
