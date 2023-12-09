package com.example.demo.service;

import com.example.demo.vo.member;

public interface memberService {
	void addmember(member m);
	member Login(String username,String password);
	boolean usernameRepeat(String username);
}
