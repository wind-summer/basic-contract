package com.example.consumer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2019/1/7
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Demo {
    private String id;
    private String name;
    private Integer age;
}
