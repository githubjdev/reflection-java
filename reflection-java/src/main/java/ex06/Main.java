
package ex06;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		Tarefa tarefa = new Tarefa();

		for (Method m : tarefa.getClass().getDeclaredMethods()) {
			if (m.isAnnotationPresent(Executar.class)) {
				m.invoke(tarefa);
			}
		}
	}
}