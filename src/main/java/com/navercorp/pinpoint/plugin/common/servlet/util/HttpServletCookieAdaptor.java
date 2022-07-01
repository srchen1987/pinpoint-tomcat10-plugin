package com.navercorp.pinpoint.plugin.common.servlet.util;

import java.util.Objects;

import com.navercorp.pinpoint.bootstrap.plugin.request.CookieAdaptor;

import jakarta.servlet.http.Cookie;

class HttpServletCookieAdaptor implements CookieAdaptor {
    private final Cookie cookie;

    public HttpServletCookieAdaptor(Cookie cookie) {
        this.cookie = Objects.requireNonNull(cookie, "cookie");
    }

    @Override
    public String getName() {
        return cookie.getName();
    }

    @Override
    public String getValue() {
        return cookie.getValue();
    }
}
