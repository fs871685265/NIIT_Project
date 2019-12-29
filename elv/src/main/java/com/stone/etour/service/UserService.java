package com.stone.etour.service;

import com.stone.etour.bean.EtourUser;

public interface UserService {

    EtourUser queryUserWithNameAndPass(String name, String password);

    void addUser(EtourUser user);

    int queryUserByName(String name);

    int queryUserByPass(String pass);

    void updateUser(EtourUser user);
}
