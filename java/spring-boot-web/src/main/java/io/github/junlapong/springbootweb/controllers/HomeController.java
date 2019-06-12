package io.github.junlapong.springbootweb.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static Logger log = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String index() {
		log.debug("index");
		// return "home";
		return "index";
    }
}
