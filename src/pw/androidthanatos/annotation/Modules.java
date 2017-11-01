package pw.androidthanatos.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 只在主module中进行注解，仅当使用多module进行开发时需要注解。
 *       @Modules({"main_module","second_module"})
 *       @Module("main_module")
 *       public class MainModule {
 *       }
 * @author thanatos
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Modules {

    String[] value();
}
