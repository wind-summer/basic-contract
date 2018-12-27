package com.example.common.entity;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author wenlongfei
 * @since 2018/12/26
 */
@Data
@Accessors(chain = true)
@ToString
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String sex;
    private String remark;
}
