package com.siants.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.siants.test.dao.LDMenuMapper;
import com.siants.test.model.LDMenu;
import com.siants.test.service.impl.ILDMenuService;

@Service
public class LDMenuService implements ILDMenuService{

	@Resource
	private LDMenuMapper ldMenuMapper;
	
	public LDMenu getLDMenuByCode(String nodeCode) {
		return ldMenuMapper.selectByPrimaryKey(nodeCode);
	}

}
