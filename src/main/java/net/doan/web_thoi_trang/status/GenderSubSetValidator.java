package net.doan.web_thoi_trang.status;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;


public class GenderSubSetValidator implements ConstraintValidator<GenderSubset, GenderEnum> {
    private GenderEnum[] genders;

    @Override
    public void initialize(GenderSubset constraint) {
        this.genders = constraint.anyOf();
    }
    @Override
    public boolean isValid(GenderEnum value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(genders).contains(value);
    }
}
