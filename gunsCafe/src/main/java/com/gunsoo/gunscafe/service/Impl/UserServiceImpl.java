package com.gunsoo.gunscafe.service.Impl;

import com.gunsoo.gunscafe.dto.UsersDto;
import com.gunsoo.gunscafe.model.Users;
import com.gunsoo.gunscafe.repository.UsersRepository;
import com.gunsoo.gunscafe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository userRepository;

    /*
     * 회원가입
     * */
    @Override
    public void insertUser(Users users) {

        users.setRanking("bronze");
        users.setPoint(0);
        users.setDate(new Date());

        userRepository.save(users);
    }

    /*
     * 회원조회
     * */
    @Override
    public UsersDto selectUser(String usersId) {

        Users users = userRepository.findByUserId(usersId);

        return UsersDto.from(users);
    }


    /*
     * 중복회원 확인
     * 존재 : true
     * 존재x : false
     * */
    @Override
    public Boolean checkUsers(String usersId) {

        Users users = userRepository.findByUserId(usersId);

        if(users==null){
            return false;
        }

        return true;
    }


}
