package net.doan.web_thoi_trang.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import net.doan.web_thoi_trang.status.*;

import java.sql.Date;

@Data
public class RegisterDTOUser {
    @NotBlank(message = "username must be not null")
    private String userName;

    @NotBlank(message = "Họ và tên không được để trống")
    @Size(min = 3, max = 50, message = "Họ và tên phải từ 3 đến 50 ký tự")
    private String fullName;

    @NotBlank(message = "Mật khẩu không được để trống")
    @Size(min = 6, message = "Mật khẩu phải có ít nhất 6 ký tự")
    private String passWord;

    @NotBlank(message = "Xác nhận mật khẩu không được để trống")
    private String confirmPassword;

    @NotBlank(message = "Địa chỉ không được để trống")
    @Size(max = 255, message = "Địa chỉ không được quá 255 ký tự")
    private String address;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    @Past(message = "Ngày sinh phải là một ngày trong quá khứ")
    private Date dateOfBirth;

    @NotBlank(message = "Số điện thoại không được để trống")
    @Pattern(regexp = "^(\\+84|0)[3-9][0-9]{8}$", message = "Số điện thoại không hợp lệ")
    private String phone;

    @GenderSubset(anyOf = {GenderEnum.NAM, GenderEnum.NỮ, GenderEnum.KHÁC})
    private GenderEnum gender;

    @EnumPattern(name = "status", regexp = "ACTIVE|INACTIVE|NONE")
    private UserStatus status;

    @NotNull(message = "type must be not null")
    @EnumValue(name = "type", enumClass = UserType.class)
    private String type;
}
