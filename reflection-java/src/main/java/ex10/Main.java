package ex10;

public class Main {
	public static void main(String[] args) {
		Class<?> clazz = PluginEmail.class;

		for (Class<?> i : clazz.getInterfaces()) {
			if (i == Plugin.class) {
				System.out.println("É um plugin válido");
			}
		}
	}
}