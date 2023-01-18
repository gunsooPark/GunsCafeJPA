package com.gunsoo.gunscafe.dto;

import com.gunsoo.gunscafe.model.Users;

import java.util.Date;

public class UsersDto {

    private String id;

    private String name;

    private String ranking;

    private int point;

    private int totalPoint;

    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UsersDto(String id, String name, String ranking, int point, int totalPoint, Date date) {
        this.id = id;
        this.name = name;
        this.ranking = ranking;
        this.point = point;
        this.totalPoint = totalPoint;
        this.date = date;
    }

    //model → Dto로 전환
    public static UsersDto from(Users users) {
        return new UsersDto(users.getId(), users.getName(), users.getPassword(),users.getPoint(),users.getTotalPoint(),users.getDate());
    }

    //Dto → model로 전환
    public static Users toEntity(UsersDto usersDto) {
        return Users.builder()
                .id(usersDto.getId())
                .name(usersDto.getName())
                .ranking(usersDto.getRanking())
                .point(usersDto.getPoint())
                .totalPoint(usersDto.getTotalPoint())
                .date(usersDto.getDate())
                .build();
    }
}
