package com.itwillbs.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.MemberVO;



@Repository
public class MemberDAOImpl implements MemberDAO {

	private static final Logger logger = 
			LoggerFactory.getLogger(MemberDAOImpl.class);
	
		// 디비 연결객체를 주입(DI)
		@Inject
		private SqlSessionFactory sqlFactory;

		// 자동연결, 해제
		@Inject
		private SqlSession sqlSession;
		
		// mapper의 주소(namespace정보)
		
		private static final String NAMESPACE
				="com.itwillbs.mapper.MemberMapper.";
		
		// 디비 서버의 시간정보를 가져오기
		@Override
		public String getServerTime() {
			
			String result =
					sqlSession.selectOne("com.itwillbs.mapper.MemberMapper.getServerTime");
			
			return result;
		}
		// 회원가입
		@Override
		public void insertMember(MemberVO vo) {
			
			sqlSession.insert(NAMESPACE + "insertMember", vo);
			
			
		}
		
		
	
	
	
	
	
}
