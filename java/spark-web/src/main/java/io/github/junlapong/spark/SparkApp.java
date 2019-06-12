package io.github.junlapong.spark;

import static spark.Spark.get;
// import static spark.Spark.secure;
// import static spark.Spark.redirect;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class SparkApp {

	private static final Logger log = LoggerFactory.getLogger(SparkApp.class);

    public static void main(String[] args) {

    	log.info("***** Spark Java App *****");

    	// spark.Spark.port(9443);
        // secure("keystore.p12", "P@ssw0rd", null, null);
    	// log.debug("URL: https://localhost:9443/");

		spark.Spark.port(9080);
		log.debug("Listen: http://localhost:9080/");
		//redirect.any("/", "/hello");

    	get("/", (request, response) -> {
            log.debug("hello");
    	    Map<String, Object> attributes = new HashMap<>();
    	    attributes.put("message", "Hello Spark");
    	    return new ModelAndView(attributes, "hello.ftl");
    	}, new FreeMarkerEngine());
    }
}
