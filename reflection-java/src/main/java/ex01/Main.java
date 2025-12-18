package ex01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		Class<Usuario> clazz = Usuario.class;

		System.out.println("Campos:");
		for (Field f : clazz.getDeclaredFields()) {
			System.out.println("- " + f.getName());
		}

		System.out.println("Métodos:");
		for (Method m : clazz.getDeclaredMethods()) {
			System.out.println("- " + m.getName());
		}
	}
}