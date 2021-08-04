package com.misiontic.main;

public class Food {

	private int calories;
	private String food_name;
	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Food(int calories) {
		this(calories, "frutas");
		this.calories = calories;
	}

	public Food(int calories, String food_name) {
		super();
		this.calories = calories;
		this.food_name = food_name;
	}
	

	//public int calories;

}
