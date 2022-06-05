package com.springbootApi.model.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)

public class AccountAuth {

    private String sub;

    private String jti;

    private String auth;
}
