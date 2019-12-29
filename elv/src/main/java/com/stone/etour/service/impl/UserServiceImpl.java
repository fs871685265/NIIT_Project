package com.stone.etour.service.impl;

import com.stone.etour.bean.EtourUser;
import com.stone.etour.bean.EtourUserExample;
import com.stone.etour.mapper.EtourUserMapper;
import com.stone.etour.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    EtourUserMapper etourUserMapper;

    @Override
    public EtourUser queryUserWithNameAndPass(String name, String password) {
        EtourUserExample example = new EtourUserExample();
        EtourUserExample.Criteria cri = example.createCriteria();
        cri.andNameEqualTo(name).andPasswordEqualTo(password);
        List<EtourUser> listUsers = etourUserMapper.selectByExample(example);
        if(listUsers.size()==0){
            return null;
        }else{
            return listUsers.get(0);
        }
    }

    @Override
    public void addUser(EtourUser user) {
        etourUserMapper.insert(user);
    }

    @Override
    public int queryUserByName(String name) {
        EtourUserExample example = new EtourUserExample();
        EtourUserExample.Criteria cri = example.createCriteria();
        cri.andNameEqualTo(name);
        List<EtourUser> listUsers = etourUserMapper.selectByExample(example);
        return listUsers.size();
    }

    @Override
    public int queryUserByPass(String pass) {
        EtourUserExample example = new EtourUserExample();
        EtourUserExample.Criteria cri = example.createCriteria();
        cri.andPasswordEqualTo(pass);
        List<EtourUser> listUsers = etourUserMapper.selectByExample(example);
        return listUsers.size();
    }

    @Override
    public void updateUser(EtourUser user) {
        etourUserMapper.updateByPrimaryKey(user);
    }
}
