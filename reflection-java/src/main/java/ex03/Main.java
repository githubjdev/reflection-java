package ex03;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto();

        Field field = Produto.class.getDeclaredField("nome");
        field.setAccessible(true);

        System.out.println(field.get(produto));
    }
}