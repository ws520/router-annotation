package pw.androidthanatos.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 对module模块进行标注，随便module里哪个类都可以
 * 多module每个module都要注解，包括主module
 * <code>
 *       @Module("main_module")
 *       public class MainModule {
 *       }
 *
 *       @Module("second_module")
 *       public class SecondModule {
 *       }
 * </code>
 * @author thanatos
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Module {
    String value();
}
