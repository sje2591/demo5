package com.example.demo5.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo5.dto.MemberDTO;
@Mapper
public interface MemberMapper {

	List<MemberDTO> selectMemberList();
	MemberDTO selectMemberDetail(@Param("ID") String id);
	void deleteMember(@Param("ID") String id);
}
