package com.oa.web.controller;

import com.alibaba.fastjson.JSON;
import com.oa.domain.Scheduler;
import com.oa.service.ISchedulerService;
import com.oa.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 日程安排控制类
 */
@Controller
public class SchedulerController {
    @Autowired
    private ISchedulerService schedulerService;

    /**
     * 日程安排 列表
     * @return
     */
    @RequestMapping("/scheduler_list")
    @ResponseBody
    public String schedulerList(){
        List<Scheduler> schedulerList = schedulerService.selectAll();
        return JSON.toJSONString(schedulerList);
    }
    /**
     * 日程安排  保存操作
     */
    @RequestMapping("/scheduler_save")
    @ResponseBody
    public JSONResult schedulerSave(Scheduler scheduler){
        schedulerService.insert(scheduler);
        return new JSONResult();
    }

    /**
     * 日程安排 删除操作
     */
    @RequestMapping("/scheduler_delete")
    @ResponseBody
    public JSONResult schedulerDelete(Scheduler scheduler){
        schedulerService.deleteByPrimaryKey(scheduler.getId());
        return new JSONResult();
    }

    /**
     * 日程安排 修改操作
     */
    @RequestMapping("/scheduler_update")
    @ResponseBody
    public JSONResult schedulerUpdate(Scheduler scheduler){
        schedulerService.updateByPrimaryKey(scheduler);
        return new JSONResult();
    }
}
