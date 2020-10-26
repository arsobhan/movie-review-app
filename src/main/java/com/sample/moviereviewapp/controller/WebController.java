package com.sample.moviereviewapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

	@RequestMapping(value="/", method = RequestMethod.GET)
    String index(){
        return "html/index";
    }
	
	@RequestMapping(value="/reviewlist", method = RequestMethod.GET)
    String reviewList(){
        return "html/reviewlist";
    }
	
	@RequestMapping(value="/addMovie", method = RequestMethod.GET)
    String addMovie(){
        return "html/movie";
    }
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
    String user(){
        return "html/movieList";
    }
	
	@RequestMapping(value="/review", method = RequestMethod.GET)
    String review(){
        return "html/review";
    }
}

