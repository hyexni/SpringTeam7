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
	
		// ��� ���ᰴü�� ����(DI)
		@Inject
		private SqlSessionFactory sqlFactory;

		// �ڵ�����, ����
		@Inject
		private SqlSession sqlSession;
		
		// mapper�� �ּ�(namespace����)
		
		private static final String NAMESPACE
				="com.itwillbs.mapper.MemberMapper.";
		
		// ��� ������ �ð������� ��������
		@Override
		public String getServerTime() {
			
			String result =
					sqlSession.selectOne("com.itwillbs.mapper.MemberMapper.getServerTime");
			
			return result;
		}
		// ȸ������
		@Override
		public void insertMember(MemberVO vo) {
			
			sqlSession.insert(NAMESPACE + "insertMember", vo);
			
			
		}
		
		
	
	
	
	
	
}
