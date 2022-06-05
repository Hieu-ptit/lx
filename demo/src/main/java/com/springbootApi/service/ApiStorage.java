package com.springbootApi.service;

import com.springbootApi.model.bo.ApiList;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ApiStorage {

    private final Logger logger = LogManager.getLogger(getClass());

    /**
     * Destination Micro Service
     */

    @Value("${app.base.url.charity}")
    public String urlCharity;

    public String apiGetUser(String userId) {
        String url = urlCharity + String.format(ApiList.API_GET_USER, userId);
        logger.info("Call to url: " + url);
        return url;
    }
}
