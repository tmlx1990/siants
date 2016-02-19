package com.siants.test.dao;

import com.siants.test.model.LDMenu;

public interface LDMenuMapper {
    int deleteByPrimaryKey(String nodecode);

    int insert(LDMenu record);

    int insertSelective(LDMenu record);

    LDMenu selectByPrimaryKey(String nodecode);

    int updateByPrimaryKeySelective(LDMenu record);

    int updateByPrimaryKey(LDMenu record);
}