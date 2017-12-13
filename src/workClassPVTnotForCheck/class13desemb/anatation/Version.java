package workClassPVTnotForCheck.class13desemb.anatation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })// указали куда можно ставить на методы и на типы
public @interface Version {
	String info();

	int someAttribute();

}
