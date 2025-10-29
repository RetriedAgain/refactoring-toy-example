
package org.animals;

public abstract class Dog {

	private int age = 0;
	public int magicNumber = 17;

	public abstract void bark();

	public int getAge() {
		return this.age;
	}

	public void takeABreath() {
		System.out.println("...");
	}

}
