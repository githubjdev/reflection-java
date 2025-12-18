package ex11Exercicio;

public class Main {
	public static void main(String[] args) {
		Produto p = new Produto(null, 150);
		ValidationEngine.validar(p).forEach(System.out::println);
	}
}
