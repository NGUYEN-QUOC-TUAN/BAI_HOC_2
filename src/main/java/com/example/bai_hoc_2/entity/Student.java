package com.example.bai_hoc_2.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Student {
    @NotBlank(message = "Không để trống email")
    @Email(message = "Không đúng định dạng email")
    private String email;
    @NotBlank(message = "Không để trống họ và tên")
    private String fullName;
    @NotNull(message = "Không để trống điểm")
    @PositiveOrZero(message = "Điểm phải lớn hơn hoặc bằng 0")
    @Max(value = 10, message = "Điểm nhỏ hơn hoặc bằng 10")
    private Double marks;
    @NotNull(message = "Chọn giới tính")
    private Boolean gender;
    @NotBlank(message = "Chọn quốc tịch")
    private String country;
}
