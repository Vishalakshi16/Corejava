package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.Fruit;
import com.xworkz.inheritanceapp.inheritance.inherite.Apple;
import com.xworkz.inheritanceapp.inheritance.inherite.Orange;

public class FruitTester {
		


			public static void main(String args[]) {
				
				Fruit fr = new Fruit();
				fr.toGetHealthier(40);
				fr.provideVitamins("vitamin c");
				System.out.println("Price of the fruit is " + fr.price);
				System.out.println("Content in fruit is " + fr.content);

				
				Apple ap = new Apple();
				ap.toGetHealthier(40);
				ap.provideVitamins("Fiber");
				System.out.println("Price of apple is " + ap.price);
				System.out.println("Content in apple is " + ap.content);
				
				Orange orng = new Orange();
				orng.toGetHealthier(36);
				orng.provideVitamins("Vitamin c ");
				System.out.println("Price of orange is " + orng.price);
				System.out.println("Content in orange is " + orng.content);
			}

		}

