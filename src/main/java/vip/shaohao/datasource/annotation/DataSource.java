package vip.shaohao.datasource.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author Shaohao 2623537618@qq.com
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    String value() default "";
}
