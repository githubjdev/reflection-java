package ex07;

import java.lang.reflect.Constructor;

public class Main {
	public static void main(String[] args) {
		for (Constructor<?> c : Cliente.class.getDeclaredConstructors()) {
			System.out.println(c);
		}
	}
}