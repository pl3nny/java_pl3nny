package com.company;

public class Main {

    public static void main(String[] args)
    {
	    Car porsche = new Car();
	    Car maserati = new Car();

	    porsche.setModel("Carrera");
        System.out.println("Porsche Model: " + porsche.getModel());
    }
}
