package com.vuclip.mvs.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vuclip.beans.Notification;
import com.vuclip.util.GenericUtil;

@Controller

@RequestMapping(value = "${maxis.mo.dn.ussd.receiver.root.request.mapping.value}")
public class MaxisMODNUssdReceiver {
	public static Logger LOGGER = Logger.getLogger(MaxisMODNUssdReceiver.class.getName());

	@RequestMapping(value = "${maxis.mo.receiver.request.mapping.value}", method = { RequestMethod.GET, RequestMethod.POST })

	public @ResponseBody String processMO(HttpServletRequest request,@RequestBody String jsonString) {

		LOGGER.debug(" MO Received >>>");
		LOGGER.debug(GenericUtil.getRequestParametersHeadersAndBody(request,jsonString));
		return HttpStatus.OK.name();
	}

	

	@RequestMapping(value = "${maxis.dn.receiver.request.mapping.value}", method = { RequestMethod.GET, RequestMethod.POST })

	public @ResponseBody String processDN(Notification notification, HttpServletRequest request,
			@RequestBody String jsonString) {

		LOGGER.debug("DN Received >>>");

		//LOGGER.debug(notification.toString());
		LOGGER.debug(GenericUtil.getRequestParametersHeadersAndBody(request,jsonString));

		return HttpStatus.OK.name();
	}
	

	@RequestMapping(value = "${maxis.ussd.receiver.request.mapping.value}", method = { RequestMethod.GET, RequestMethod.POST })

	public @ResponseBody String processUssd(Notification notification, HttpServletRequest request,
			@RequestBody String jsonString) {

		LOGGER.debug("Ussd Received >>>");

		//LOGGER.debug(notification.toString());
		LOGGER.debug(GenericUtil.getRequestParametersHeadersAndBody(request,jsonString));
		return HttpStatus.OK.name();
	}
	

}
