package ex11Exercicio;

import java.lang.reflect.Field;
import java.util.*;

public class ValidationEngine {
	public static List<String> validar(Object obj) {
		List<String> erros = new ArrayList<>();
		for (Field field : obj.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			try {
				Object value = field.get(obj);

				if (field.isAnnotationPresent(NotNull.class) && value == null) {
					erros.add("Campo '" + field.getName() + "' não pode ser nulo");
				}

				if (value instanceof Number) {
					int num = ((Number) value).intValue();

					if (field.isAnnotationPresent(Min.class)) {
						int min = field.getAnnotation(Min.class).value();
						if (num < min)
							erros.add("Campo '" + field.getName() + "' menor que " + min);
					}
					if (field.isAnnotationPresent(Max.class)) {
						int max = field.getAnnotation(Max.class).value();
						if (num > max)
							erros.add("Campo '" + field.getName() + "' maior que " + max);
					}
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return erros;
	}
}
