package com.oa.service.impl;

import com.oa.domain.Task;
import com.oa.mapper.TaskMapper;
import com.oa.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements ITaskService{
    @Autowired
    private TaskMapper taskMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return taskMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int insert(Task record) {
        return taskMapper.insert(record);
    }
    @Override
    public Task selectByPrimaryKey(Long id) {
        return taskMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<Task> selectAll() {
        return taskMapper.selectAll();
    }
    @Override
    public List<Task> selectByState(int state) {

        return taskMapper.selectByState(state);
    }
    @Override
    public int updateByPrimaryKey(Task record) {
        return taskMapper.updateByPrimaryKey(record);
    }
}
