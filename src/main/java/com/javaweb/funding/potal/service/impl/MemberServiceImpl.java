package com.javaweb.funding.potal.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.funding.bean.Member;
import com.javaweb.funding.potal.dao.MemberMapper;
import com.javaweb.funding.potal.service.MemberService;


@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper ;

	@Override
	public Member queryMebmerlogin(Map<String, Object> paramMap) {
		Set set = paramMap.entrySet();
		for(Object obj : set){
			Map.Entry<String, Object> entry = (Map.Entry<String, Object>)obj;
			System.out.println(obj);
		}
		
		return memberMapper.queryMebmerlogin(paramMap);
	}

	@Override
	public void updateAcctType(Member loginMember) {
		memberMapper.updateAcctType(loginMember);
	}

	@Override
	public void updateBasicinfo(Member loginMember) {
		memberMapper.updateBasicinfo(loginMember);
	}

	@Override
	public void updateEmail(Member member) {
		
		memberMapper.updateEmail(member);
	}

	@Override
	public void updateAuthstatus(Member loginMember) {
		memberMapper.updateAuthstatus(loginMember);
		
	}

	@Override
	public Member getMemberById(Integer memberid) {
		// TODO Auto-generated method stub
		return memberMapper.getMemberById(memberid);
	}

	@Override
	public List<Map<String, Object>> queryCertByMemberid(Integer memberid) {
		// TODO Auto-generated method stub
		return memberMapper.queryCertByMemberid(memberid);
	}
	
}
