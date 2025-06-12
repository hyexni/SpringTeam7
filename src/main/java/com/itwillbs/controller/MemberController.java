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
				
				logger.info(" serverTimeGET() ����! ");
				
	
				
				String time = mService.getServerTime();
				
				logger.info(" time : " + time);
				
				model.addAttribute("time", time);
				
				logger.info(" /views/serverTime.jsp ������ ��� ");
				
			}
			
			// http://localhost:8088/member/join
			// ȸ������
			@RequestMapping(value = "/join", method = RequestMethod.GET)
			public void memberJoinGET() {
				
				logger.info(" memberJoinGET() ���� ! ");
				logger.info(" /views/member/join.jsp ������ �̵� ");
				
			}
			@RequestMapping(value = "/join", method = RequestMethod.POST)
			public String memberJoinPOST(MemberVO vo) {
				
				logger.info(" memberJoinPOST() ���� ! ");		
				
				logger.info("vo : " + vo);
				
				mService.memberJoin(vo);
				
				
				return "redirect:/member/join";
				
			}
}
