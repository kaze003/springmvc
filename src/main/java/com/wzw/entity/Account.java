package com.wzw.entity;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author wei
 * @Date 2021/7/12
 */
@Data
public class Account {

    @NotEmpty(message = "用户名不能为空")
    private String username;

    @Size(min = 6, max = 20, message = "密码长度为6-20位")
    private String password;

//    @Email(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\\\\\\\.[a-zA-Z0-9-]+)*\\\\\\\\.[a-zA-Z0-9]{2,6}$", message = "请输入正确的邮箱")
    private String email;

//    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0, 5-9]))\\\\\\\\\\\\\\\\d{8}$]", message = "请输入正确的电话格式")
    private String phone;
}
