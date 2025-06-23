package com.spring.mybatis.entity;

/**需要在pom.xml加载Lombok依赖*/
import lombok.*;

@Data /**提供构造方法，tostring方法*/
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@AllArgsConstructor/**提供全参构造方法*/
@NoArgsConstructor/**提供无参构造方法*/
public class account {
    private int id;
    private String username;
    private String password;
    private int age;
}
