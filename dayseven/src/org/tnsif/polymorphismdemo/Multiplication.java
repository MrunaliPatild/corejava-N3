package org.tnsif.polymorphismdemo;

public class Multiplication {
	int mul(int x,int y) {
		return x*y;
	}
	int mul(float x,int y) {
		return (int)(x*y);
	}

}
