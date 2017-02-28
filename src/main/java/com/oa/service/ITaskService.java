package com.oa.service;

import com.oa.domain.Task;

import java.util.List;

public interface ITaskService {

    int deleteByPrimaryKey(Long id);

    int insert(Task record);

    Task selectByPrimaryKey(Long id);

    List<Task> selectAll();

    int updateByPrimaryKey(Task record) ;

    List<Task> selectByState(int state);

}
