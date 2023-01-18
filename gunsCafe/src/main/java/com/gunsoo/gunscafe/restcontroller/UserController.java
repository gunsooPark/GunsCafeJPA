package com.gunsoo.gunscafe.restcontroller;

import com.gunsoo.gunscafe.dto.UsersDto;
import com.gunsoo.gunscafe.exception.DefaultException;
import com.gunsoo.gunscafe.exception.DuplicateException;
import com.gunsoo.gunscafe.exception.UserNulltException;
import com.gunsoo.gunscafe.model.Users;
import com.gunsoo.gunscafe.service.UserService;
import com.gunsoo.gunscafe.utils.ResponseUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*
     * 회원등록
     */
    @ApiOperation(value = "회원등록", notes = "최초 회원 등록")
    @PostMapping("/insert")
    public ResponseEntity<Map<String,Object>> insertUser(@RequestBody Users users){

        final String API_ID = "inserUser";
        Map<String, Object> resultMap = new HashMap<>();

        try {
           //중복조회
            Boolean checkUser = userService.checkUsers(users.getId());

            if(checkUser){
               throw new DuplicateException(API_ID, resultMap);
            }

            userService.insertUser(users);

        }catch (DuplicateException duplicateException){
            throw duplicateException;
        }catch(Exception e){
           throw new DefaultException(API_ID, resultMap);
        }

        return ResponseUtils.commonResponse(API_ID,resultMap,HttpStatus.OK);
    }

    /*
     * 회원조회
     */
    @PostMapping("/select")
    public ResponseEntity<Map<String, Object>> selectUser(@RequestBody Users users){

        final String API_ID = "selectUser";
        Map<String, Object> resultMap = new HashMap<>();

        try {

            UsersDto resultUserDto = userService.selectUser(users.getId());

            if(resultUserDto==null){
                throw new UserNulltException(API_ID, resultMap);
            }

            resultMap.put("User", resultUserDto);

        }catch (UserNulltException userNulltException){
            throw userNulltException;
        } catch (Exception e){
            throw new DefaultException(API_ID, resultMap);
        }

        return ResponseUtils.commonResponse(API_ID,resultMap,HttpStatus.OK);
    }

    @PostMapping("/test")
    public String test(Map<String, Object> map){
        return "test";
    }


}













