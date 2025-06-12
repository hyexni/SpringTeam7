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
	
	
	// 찜한 도서 추천 (GET)
	@RequestMapping(value = "/byWishlist", method = RequestMethod.GET)
	public String recommendByWishlist() {
		logger.info(" recommendByWishlist() 호출 ");
		return "recommend/recommend_page_02";
	}
	
	
	// 추천 정렬 (GET)
	@RequestMapping(value = "/sort?type=", method = RequestMethod.GET)
	public String sortRecommend() {
		logger.info(" sortRecommend() 호출 ");
		return "recommend/recommend_page_03";
	}
	
	
	// 추천 결과 출력 (GET)
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String recommendResult() {
		logger.info(" recommendResult() 호출 ");
		return "recommend/recommend_page_04";
	}
	

} // RecommendController 끝

