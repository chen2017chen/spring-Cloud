package com.ccc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/26 16:05
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  {

    private String name;
    private int age;
    private String sex;
}
