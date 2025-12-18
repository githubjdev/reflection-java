package ex05;

public class Main {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("ex05.ServicoPagamento");
		Object obj = clazz.getDeclaredConstructor().newInstance();
	}
}