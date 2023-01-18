package com.gunsoo.gunscafe.service;

import com.gunsoo.gunscafe.dto.UsersDto;
import com.gunsoo.gunscafe.model.Users;

public interface UserService {

    public void insertUser(Users users);
    public UsersDto selectUser(String usersId);
    public Boolean checkUsers(String usersId);
}
