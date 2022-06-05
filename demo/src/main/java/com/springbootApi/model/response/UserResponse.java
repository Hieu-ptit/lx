package com.springbootApi.model.response;

import com.dslplatform.json.CompiledJson;
import com.springbootApi.model.bo.Gender;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Data
@Accessors(chain = true)
@CompiledJson
public class UserResponse {

    private String id;

    private String email;

    private Integer age;

    private Gender gender;

    private String address;

    private String identity;

    private String phone;
}
