package com.itwillbs.persistence;

import com.itwillbs.domain.MemberVO;

public interface MemberDAO {

	
		// ��� ������ �ð������� ��������
		public String getServerTime();	
		
		// ȸ������ ó��
		public void insertMember(MemberVO vo);
		
}
