package com.oa.service.impl;

import com.oa.domain.Scheduler;
import com.oa.mapper.SchedulerMapper;
import com.oa.service.ISchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchedulerServiceImpl  implements ISchedulerService{
    @Autowired
    private SchedulerMapper schedulerMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        schedulerMapper.deleteByPrimaryKey(id);
        return 0;
    }

    @Override
    public int insert(Scheduler record) {
        schedulerMapper.insert(record);
        return 0;
    }

    @Override
    public Scheduler selectByPrimaryKey(Long id) {

        return schedulerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Scheduler> selectAll() {
        return schedulerMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Scheduler record) {
        schedulerMapper.updateByPrimaryKey(record);
        return 0;
    }
}
