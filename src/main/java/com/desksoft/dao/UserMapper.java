package com.desksoft.dao;

import com.wshsoft.dal.domain.User;
import java.util.List;

public interface UserMapper {
    int delete(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> listPage();

    int updateByPrimaryKey(User record);
}