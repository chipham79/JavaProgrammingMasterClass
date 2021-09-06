package Annotation.CustomAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER,ElementType.FIELD ,ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE})
@Inherited
public @interface CustomAnnotation {
	String name() default "Jackson";
	int age() default 0;
	String[] langauge() default {"Annotation"};
}
