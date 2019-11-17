package com.age.dbaas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor //全参构造函数
@NoArgsConstructor //无参的构造函数
@Data
@Accessors(chain = true) //链式书写方式，例：TestEntity entity = new TestEntity(); entity.setId(1).setMessage("例子")
public class TestEntity {
    private int id;
    private String message;
}
