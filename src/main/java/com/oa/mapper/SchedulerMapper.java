package com.oa.mapper;

import com.oa.domain.Scheduler;
import java.util.List;

public interface SchedulerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Scheduler record);

    Scheduler selectByPrimaryKey(Long id);

    List<Scheduler> selectAll();

    int updateByPrimaryKey(Scheduler record);
}