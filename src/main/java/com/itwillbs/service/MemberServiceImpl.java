package com.itwillbs.service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{
	
	private static final Logger logger = 
			LoggerFactory.getLogger(MemberServiceImpl.class);
	
	// MemberDAO 객체를 주입
			@Inject
			private MemberDAO mDao;

			@Override
			public String getServerTime() {
				
				logger.info(" getServerTime() 실행 ");
				// 디비의 서버시간정보를 가져오기 동작을 DAO에 요청
				return mDao.getServerTime();
			}

			@Override
			public void memberJoin(MemberVO vo) {
				
				logger.info(" memberJoin() 실행");
				// 회원가입 -> DAO를 사용해서 호출
				
				mDao.insertMember(vo);
				
			}

			
	
	
}
