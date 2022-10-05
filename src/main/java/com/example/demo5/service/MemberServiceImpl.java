package com.example.demo5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo5.dto.MemberDTO;
import com.example.demo5.mapper.MemberMapper;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberMapper memberMapper;
	@Override
	public List<MemberDTO> selectMemberlist() {
		// TODO Auto-generated method stub
		return memberMapper.selectMemberList();
	}
	@Override
	public MemberDTO selectMemberDetail(String id) {
		// TODO Auto-generated method stub
		return memberMapper.selectMemberDetail(id);
	}
	@Override
	public void deleteMember(String id) {
		// TODO Auto-generated method stub
		memberMapper.deleteMember(id);
	}

}
