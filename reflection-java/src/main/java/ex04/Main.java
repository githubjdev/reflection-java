package ex04;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws Exception {
		Config config = new Config();

		Field field = Config.class.getDeclaredField("url");
		field.setAccessible(true);
		field.set(config, "jdbc:postgresql://localhost/db");

		System.out.println("URL configurada com sucesso: " + field.get(config));
	}
}