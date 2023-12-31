package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.memberMapper;
import com.example.demo.service.memberService;
import com.example.demo.vo.member;

@Service
public class memberServiceImpl implements memberService{
	@Autowired
	memberMapper mp;

	@Override
	public void addmember(member m) {
		mp.add(m);
	}

	@Override
	public member Login(String username, String password) {
		member m = mp.queryMember(username, password);
		return m;
	}

	@Override
	public boolean usernameRepeat(String username) {
		member m = mp.queryUsername(username);
		boolean x = false;
		if(m!=null) x = true;
		return x;
	}

}
