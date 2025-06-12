package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/recommend/*")
public class RecommendController {
	
	//mylog
	private static final Logger logger = LoggerFactory.getLogger(RecommendController.class);
	
	// 구매 기반 추천 (GET)
	@RequestMapping(value = "/byPurchase", method = RequestMethod.GET)
	public String recommendByPurchase() {
		logger.info(" recommendByPurchase() 호출 ");
		return "recommend/recommend_page_01";
	}

} // RecommendController 끝
