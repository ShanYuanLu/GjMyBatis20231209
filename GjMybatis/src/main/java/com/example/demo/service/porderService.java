package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.vo.porder;


public interface porderService {
	void add(porder p);
	List<porder> findAll();
}
