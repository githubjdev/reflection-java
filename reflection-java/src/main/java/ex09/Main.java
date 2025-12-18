package ex09;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws Exception {

		UsuarioDTO dtoUser = new UsuarioDTO();
		dtoUser.nome = "Alex";
		dtoUser.idade = 38;

		Usuario usuario = new Usuario();

		for (Field f : dtoUser.getClass().getDeclaredFields()) {

			for (Field u : usuario.getClass().getDeclaredFields()) {

				if (u.getName().equals(f.getName())) {
					u.set(usuario, f.get(dtoUser));
				}

			}
		}

		System.out.println(usuario.nome);
		System.out.println(usuario.idade);
	}
}