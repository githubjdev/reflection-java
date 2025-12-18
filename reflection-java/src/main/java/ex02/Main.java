package ex02;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("ex02.ServicoEmail");
		Object obj = clazz.getDeclaredConstructor().newInstance();

		Method method = clazz.getMethod("enviar");
		method.invoke(obj);
	}
}