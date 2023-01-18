package com.gunsoo.gunscafe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Users")
public class Users {

    @Id
    @Column(name = "users_id",length = 50)
    private String id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 100)
    private String phoneNumber;

    @Column(nullable = false, length = 100)
    private String ranking;

    @Column(nullable = false)
    private int point;

    @Column(nullable = false)
    private int totalPoint;

    @Column(nullable = false)
    private Date date;
}
