package com.caveofprogramming.spring.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caveofprogramming.spring.web.DAOs.Offer;
import com.caveofprogramming.spring.web.DAOs.OffersDAO;

@Service("offersservice")
public class OffersService {
	private OffersDAO offerdao;
	@Autowired
	public void setOfferdao(OffersDAO offerdao) {
		this.offerdao = offerdao;
	}
	public List<Offer> getOffers(){
		return offerdao.getOffers();
	}
}
