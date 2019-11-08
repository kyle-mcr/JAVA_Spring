package com.kyle.web.models;

public class Animal {
	private String name;
	private int age;
	private int weight;
	
	public Animal() {
	}
	public Animal(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void Setage(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void Setweight(int weight) {
		this.weight = weight;
	}
	public String displayInfo() {
		return "This animals name is " + name + "his age is " + age + "and he weighs " + weight;
	}
	
}
