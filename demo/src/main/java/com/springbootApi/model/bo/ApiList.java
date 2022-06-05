package com.springbootApi.model.bo;

public interface ApiList {

    // DRIVER
    String API_ACCOUNT_IN_DRIVE = "/drivers/accounts/exists";
    String API_ACCOUNT_BY_PHONE = "/drivers/accounts/accounts-info?phone-number=%s";
    String API_ACCOUNT_BY_ID = "/drivers/accounts/order-history/%s";
    String API_ACCOUNT_DRIVER = "/drivers/accounts/order/history/%s";
    String API_DRIVER_DETAILS_RESPONSE = "/drivers/driver-detail/swap-point?driver-id=%s&swap-coins=%s";
    String API_PROFILE_DRIVER = "/drivers/profiles/%s";
    String API_GET_DETAIL_CASH_LIMIT_DRIVE = "drivers/cash-limit/detail?account-id=%s&user-type=%s&product-id=%d";
    String API_GET_CASH_LIMIT_DRIVE = "drivers/cash-limit?account-id=%s&user-type=%s";
    String API_GET_DEVICE_TOKEN = "drivers/device-tokens/driver/%s";
    String API_GET_DRIVER_PROFILE = "/drivers/profiles?phone-number=%s";
    String API_GET_ALL_PRODUCT_OIL = "/management/products/products-oil";
    String API_UPDATE_PAYMENT = "/statistical/payments/%s";
    String API_GET_ALL_CUSTOMER = "/drivers/accounts?search-text=%s&page=%d&size=%d&field-sort=%s&direction-sort=%s";
    String API_UPDATE_ACCOUNT_DRIVER = "/drivers/accounts/enterprise/%s";
    String API_GET_CHECK_PHONE_NUMBER = "/drivers/accounts/phone-exists?account-id=%s&phone=%s";
    String API_GET_RANK_DRIVER = "/drivers/accounts/details/%s?type=%s";
    String API_GET_DRIVER_DETAIL_POINT = "/drivers/accounts/detail/%s";
    String UPDATE_RANK_DRIVER = "/drivers/driver-detail/ranks";

    // Enterprise
    String API_FIND_VEHICLE_BY_DRIVER = "/drivers/vehicles?driver-id=%s&search-text=%s&page=%d&size=%d&field-sort=%s&direction-sort=%s";
    String API_GET_ACCOUNT_CHILD = "/drivers/cash-limit/child-accounts?driver-id=%s&search-text=%s&page=%d&size=%d&field-sort=%s&direction-sort=%s";
    String API_GET_DRIVER_DETAIL = "/drivers/cash-limit/infos?driver-id=%s";
    String API_ENTERPRISE_BY_DRIVER = "/drivers/enterprises?account-id=%s";

    // ADMIN Management
    String API_GET_EMPLOYEE_BY_ACCOUNT_ID = "/management/employees/details?accountId=%s";
    String API_GET_EMPLOYEE_BY_STATION_ID = "/management/employees/station";
    String API_GET_DETAIL_EMPLOYEE_BY_ID = "/management/employees/details/%d";

    // Public management
    String API_QR_CODE_IN_MANAGEMENT = "/management/qrs/infos";

    // Specific Management

    // WaveHouse Management
    String API_GET_PRODUCT_DETAIL = "/management/products/%s?area-type=%s";
    String API_PRODUCT = "/management/products/category/%d";
    String API_PRODUCTS = "/management/products/fuels";

    String API_GET_ALL_PRODUCT_ACTIVE = "/management/products/actives";
    String API_REDUCE_LIMIT = "/drivers/cash-limit/reduce";
    String API_GET_PRODUCT = "/management/products/category";
    String API_GET_PROMOTION_LITERS = "/management/promotions/liters?product-id=%s&quantity=%s";

    //report statistical
    String API_GET_PAYMENT = "/statistical/payments?order-ids=%s";
    String API_GET_PAYMENT_HISTORY = "/statistical/payments/history?order-ids=%s";

    String API_GET_LIST_PRODUCT_DETAIL_RESPONSE = "/management/products/lists/fuel-names";

    String API_GET_USER = "api/user/%s";

    //shift management
    String API_CHECK_ORDER_BY_SHIFT = "/management/lock-shifts/internal-order/%d";
    String API_CALENDAR_BY_EMPLOYEE_ID = "/management/calendars/employee-order?employee-id=%d";
    String API_UPDATE_CALENDAR_BY_EMPLOYEE_ID = "/management/calendars/employee-order/internal?calendar-id=%d&enable=%s";
    String API_EMPLOYEE_LOCK_SHIFT = "/management/lock-shifts/employees/infos?station-id=%s&pump-pole-id=%s";
    String API_GET_CALENDER_BY_PUMP_POLE_ID = "/management/calendars/pump-pole?pump-pole-id=%s";

    // notify
    String API_PUSH_NOTIFY = "/notifications";

}
