package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/receipt/*")
public class ReceiptOcrController {
	//mylog
	
	private static final Logger logger = LoggerFactory.getLogger(ReceiptOcrController.class);

	//기능을 정의
   
		//http://localhost:8088/receipt/ocr  (o) 
		// 글쓰기(정보 입력) / GET
		@RequestMapping(value="/ocr",method = RequestMethod.GET )
		public void receipt_OcrGET() {
		
			logger.info("receipt_OcrGET()실행");
			logger.info("/views/receipt/Ocr.jsp 페이지로 이동");
		}
		
		// 글쓰기(정보 처리) / POST

		
		
		
		
		
	}//Receipt_OcrController

