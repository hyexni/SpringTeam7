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
	
	// MemberDAO ��ü�� ����
			@Inject
			private MemberDAO mDao;

			@Override
			public String getServerTime() {
				
				logger.info(" getServerTime() ���� ");
				// ����� �����ð������� �������� ������ DAO�� ��û
				return mDao.getServerTime();
			}

			@Override
			public void memberJoin(MemberVO vo) {
				
				logger.info(" memberJoin() ����");
				// ȸ������ -> DAO�� ����ؼ� ȣ��
				
				mDao.insertMember(vo);
				
			}

			
	
	
}
