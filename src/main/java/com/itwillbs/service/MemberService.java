package com.itwillbs.service;

import com.itwillbs.domain.MemberVO;

public interface MemberService {

			// 서버시간 조회
	
			public String getServerTime();
			
			// 회원가입 처리 
			
			public void memberJoin(MemberVO vo);
	
}
