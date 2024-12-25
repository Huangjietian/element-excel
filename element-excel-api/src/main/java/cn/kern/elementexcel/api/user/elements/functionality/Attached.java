package cn.kern.elementexcel.api.user.elements.functionality;

import java.lang.annotation.*;

/**
 * <p>
 *     附加的表格内容，
 *     为了避免配置类的各类配置过多，导致配置类难以阅读和维护，编程人员可以通过在主模板类中添加额外的模板配置对模板的不同配置进行分类
 *     例如
 *
 *     public class MasterTemplate {
 *
 *         @Attached(1) // 关于风格的配置
 *         private StyleTemplate styles;
 *         @Attached(2) // 关于文本框的配置
 *         private TextBoxTemplate textBox;
 *
 *         @Column("NAME")
 *         private String name;
 *         @Column("BIRTHDATE")
 *         private LocalDate birthDate;
 *         @Column("GENDER")
 *         private Integer gender;
 *     }
 * </p>
 *
 * @author Kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Attached {

    /**
     * 多个附加模板的解析顺序
     */
    int value() default 0;

}
