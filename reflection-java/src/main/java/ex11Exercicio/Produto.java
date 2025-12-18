package ex11Exercicio;

public class Produto {
	@NotNull
	private String nome;

	@Min(1)
	@Max(100)
	private int quantidade;

	public Produto(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}
}
