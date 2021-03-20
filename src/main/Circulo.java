package main;

import processing.core.PApplet;

public class Circulo {
	int xMov, yMov, r, g, b;
	PApplet app;
	
	public Circulo (int xMov, int yMov, int r, int g, int b, PApplet app) {
		this.xMov = xMov;
		this.yMov = yMov;
		this.r = r;
		this.g = g;
		this.b = b;
		this.app = app;
	}

	public int getXMov() {
		return xMov;
	}

	public void setXMov(int xMov) {
		this.xMov = xMov;
	}

	public int getYMov() {
		return yMov;
	}

	public void setYMov(int yMov) {
		this.yMov = yMov;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}

