package com.generics.mealplan;

//Generic method
class MealPlanner {
 public static <T extends MealPlan> void generateMeal(T plan) {
     System.out.println("Meal Plan Generated: " + plan.getMealType());
 }
}

class MealPlanApp {
 public static void main(String[] args) {

     VegetarianMeal veg = new VegetarianMeal();
     VeganMeal vegan = new VeganMeal();

     MealPlanner.generateMeal(veg);
     MealPlanner.generateMeal(vegan);
 }
}