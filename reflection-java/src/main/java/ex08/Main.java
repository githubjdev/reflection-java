
package ex08;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws Exception {
		Usuario u = new Usuario();

		for (Field f : u.getClass().getDeclaredFields()) {
			f.setAccessible(true);
			if (f.get(u) == null) {
				System.out.println("Campo " + f.getName() + " está nulo");
			}else {
				System.out.println("Valor do Campo :" + f.get(u)  );
			}
		}
	}
}