package com.liepin.pojo.test;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author ju
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Stu {

    private Integer id;
    private String name;
    private Integer age;

}
