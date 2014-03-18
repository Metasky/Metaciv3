package civilisation.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/** 
 * Annotation pour g_rer les param_tres de la simulation de types integer
 * @author DTEAM
 * @version 1.0 - 2/2013
*/


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PACKAGE, ElementType.FIELD})

public @interface ParametrisationInteger {
	int min();
	int max();
	int pas() default 1;
	String toolTip() default "";


}
