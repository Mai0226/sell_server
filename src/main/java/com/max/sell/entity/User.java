package com.max.sell.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class User implements Serializable {
    @Id
    @GenericGenerator(name = "sys-uuid", strategy = "uuid")
    @GeneratedValue(generator = "sys-uuid")
    private String userId;
    private String account;
    private String password;
    private String userGroup;
    private String imgUrl;
    private Timestamp createTime;
    private String shopId;

}
