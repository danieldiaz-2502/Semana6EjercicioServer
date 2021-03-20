package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import processing.core.PApplet;

public class Main extends PApplet {

	int xMov;
	int yMov;
	int r, g, b;
	private Server conexion;
	PApplet app;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
	}
	
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		
		conexion = new Server();
		conexion.setMain(this);
		conexion.start();
		xMov = 100;
		yMov = 100;
	}

	public void draw() {
		
		background(0, 0, 0);
		fill(r,g,b);
		ellipse(xMov,yMov,50,50);
		
	}
	
	public void mover(Circulo circle) {
		
		xMov = circle.getXMov();
		yMov = circle.getYMov();
		r = circle.getR();
		g = circle.getG();
		b = circle.getB();

	}
	
}
