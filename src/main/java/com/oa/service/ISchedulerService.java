package com.oa.service;

import com.oa.domain.Scheduler;

import java.util.List;

/**
 * 日程安排接口
 */
public interface ISchedulerService {
    int deleteByPrimaryKey(Long id);

    int insert(Scheduler record);

    Scheduler selectByPrimaryKey(Long id);

    List<Scheduler> selectAll();

    int updateByPrimaryKey(Scheduler record);
}
