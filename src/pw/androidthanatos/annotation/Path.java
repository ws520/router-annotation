package pw.androidthanatos.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 目前只支持在activity上进行使用
 * <code>
 *     @Path("main")
 *     public class MainActivity extends AppCompatActivity{
 *         ...
 *     }
 * </code>
 * @author thanatos
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Path {
    String value();
}

