package com.jhgoldresort.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Service {

    public Object execute(HttpServletRequest request, HttpServletResponse response);
}
