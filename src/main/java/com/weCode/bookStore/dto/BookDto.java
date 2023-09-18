package com.weCode.bookStore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String title;
}

//@Data: 自动生成 getter、setter、toString、equals 和 hashCode 方法。
//@Builder: 为类创建一个内部的builder类，允许你使用builder模式进行对象的实例化。
//@AllArgsConstructor: 自动生成一个包含所有字段的构造函数。
//@NoArgsConstructor: 自动生成一个无参数的构造函数。
//        因为你已经使用了 @Data 注解，所以Lombok会为你的所有字段生成getter和setter方法。所以，手动提供的getTitle和setTitle方法实际上是冗余的，因为 Lombok 已经为你做了这个工作。
//        为了简化代码，你可以安全地删除getTitle和setTitle方法，Lombok会自动生成这些方法。确保你的IDE已经安装了Lombok插件，这样它可以识别和使用这些Lombok生成的方法。