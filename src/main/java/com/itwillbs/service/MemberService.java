package com.itwillbs.service;

import com.itwillbs.domain.MemberVO;

public interface MemberService {

			// �����ð� ��ȸ
	
			public String getServerTime();
			
			// ȸ������ ó�� 
			
			public void memberJoin(MemberVO vo);
	
}
