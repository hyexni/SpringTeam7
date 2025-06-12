package com.itwillbs.persistence;

import com.itwillbs.domain.MemberVO;

public interface MemberDAO {

	
		// 디비 서버의 시간정보를 가져오기
		public String getServerTime();	
		
		// 회원가입 처리
		public void insertMember(MemberVO vo);
		
}
