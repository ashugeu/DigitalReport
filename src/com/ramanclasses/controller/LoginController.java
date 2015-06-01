package com.ramanclasses.controller;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;

public class LoginController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning Login view");
        ModelAndView modelandview =new ModelAndView("login");
		modelandview.addObject("welcomemessage", "Hi, Welcome to Raman Classes Digital Reports");
		return modelandview;

        //return new ModelAndView("/jsp/login.jsp");
    }

}