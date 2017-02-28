package com.oa.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Task {
    private Long id;
    private Date sendTime;
    private String content;
    private String sender;
    private int state;
}