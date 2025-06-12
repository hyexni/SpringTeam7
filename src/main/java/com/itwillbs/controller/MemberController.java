package com.itwillbs.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.service.MemberService;

@Controller
@RequestMapping(value = "/member/*")

public class MemberController {
	
			@Inject
			private MemberService mService;
			
			
			private static final Logger logger = 
					LoggerFactory.getLogger(MemberController.class);
			
			
			@RequestMapping(value = "/serverTime", method = RequestMethod.GET)
			public void serverTimeGET(Model model) {
				
				logger.info(" serverTimeGET() 실행! ");
				
	
				
				String time = mService.getServerTime();
				
				logger.info(" time : " + time);
				
				model.addAttribute("time", time);
				
				logger.info(" /views/serverTime.jsp 페이지 출력 ");
				
			}
			
			// http://localhost:8088/member/join
			// 회원가입
			@RequestMapping(value = "/join", method = RequestMethod.GET)
			public void memberJoinGET() {
				
				logger.info(" memberJoinGET() 실행 ! ");
				logger.info(" /views/member/join.jsp 페이지 이동 ");
				
			}
			@RequestMapping(value = "/join", method = RequestMethod.POST)
			public String memberJoinPOST(MemberVO vo) {
				
				logger.info(" memberJoinPOST() 실행 ! ");		
				
				logger.info("vo : " + vo);
				
				mService.memberJoin(vo);
				
				
				return "redirect:/member/join";
				
			}
}
