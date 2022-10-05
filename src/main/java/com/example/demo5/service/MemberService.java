package com.example.demo5.service;

import java.util.List;

import com.example.demo5.dto.MemberDTO;

public interface MemberService {
	
List<MemberDTO> selectMemberlist();
MemberDTO selectMemberDetail(String id);
void deleteMember(String id);


}
