package com.caveofprogramming.spring.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.caveofprogramming.spring.web.DAOs.Offer;
import com.caveofprogramming.spring.web.services.OffersService;

@Controller
public class OffersController {
	/*
	 * public ModelAndView showHome() { ModelAndView mv = new ModelAndView("home");
	 * Map<String, Object> model = mv.getModel(); model.put("name", "Vishank");
	 * return mv; }
	 */
	private OffersService offersService;
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String showTest(Model model, @RequestParam("id") String id) {
		System.out.println("ID : "+id);
		return "home";
	}
	@RequestMapping(value="/")
	public String showHome() {
		return "home";
	}
	@RequestMapping("/offers")
	public String showOffers(Model model) {
		model.addAttribute("offers", offersService.getOffers());
		return "Offers";
	}
	@RequestMapping("/createOffer")
	public String createOffer() {
		return "CreateOffer";
	}
	@RequestMapping("/doCreate")
	public String doCreate(Model model, @Valid Offer offer, BindingResult result) {
		if(result.hasErrors()) {
			List<ObjectError> ls = result.getAllErrors();
			for(ObjectError oe:ls) {
				System.out.println(oe.getDefaultMessage());
			}
		}
		else {
			offersService.createOffer(offer);
		}
		return"OfferCreated";
	}
}
