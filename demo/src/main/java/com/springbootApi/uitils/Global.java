package com.springbootApi.uitils;

import com.dslplatform.json.JsonReader;
import com.dslplatform.json.runtime.Generics;
import com.springbootApi.model.response.Response;
import com.springbootApi.model.response.UserResponse;
import com.util.Json;

import java.util.Arrays;
import java.util.List;

public class Global {

    public final static String ORDER_CODE_NO_SEQUENCE = "order_code_no_seq_1";
    public final static List<String> fieldSortAccountAndCashLimit = Arrays.asList("phone", "status", "cash_limit_money");
    public static String getFunctionPostgres = "jsonb_extract_path_text";
    public static final String BEARER = "Bearer";

    public static final JsonReader.ReadObject<Response<UserResponse>> userResponse =
        Json.findReader(Generics.makeParameterizedType(Response.class, UserResponse.class));

    public Global() {
    }
}
