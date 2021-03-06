package com.vuclip.smart.combodia.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vuclip.beans.Notification;
import com.vuclip.util.GenericUtil;

public class SmartCombodiaCGNotificationListener {
	public static Logger LOGGER = Logger.getLogger(SmartCombodiaCGNotificationListener.class.getName());

	@RequestMapping(value = "${sc.cg.notification.listner.rmv}", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody String getListenerParamValues(Notification notification, HttpServletRequest request,
			@RequestBody String jsonString) {

		LOGGER.debug("CG Notification Listened >>>");

		// LOGGER.debug(request.getQueryString());

		LOGGER.debug(notification.toString());

		LOGGER.debug(GenericUtil.getRequestParametersHeadersAndBody(request,jsonString));

		return HttpStatus.OK.name();
	}

	
}
