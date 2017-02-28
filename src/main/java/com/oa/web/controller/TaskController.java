package com.oa.web.controller;

import com.alibaba.fastjson.JSON;
import com.oa.domain.Task;
import com.oa.service.ITaskService;
import com.oa.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TaskController {
    @Autowired
    private ITaskService taskService;

    /**
     *新建一个任务呀
     */
    @RequestMapping("/task_save")
    @ResponseBody
    public JSONResult taskSave(Task task){
        JSONResult jsonResult = new JSONResult();
        try{
            taskService.insert(task);
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.mark("错误");
        }
        return jsonResult;
    }

    /**
     * 查询所有任务
     * @return
     */
    @RequestMapping("/task_list")
    @ResponseBody
    public String taskList(){
        List<Task> taskList = taskService.selectAll();
        return JSON.toJSONString(taskList);
    }

    /**
     * 查询单个任务
     */
    @RequestMapping("/task_select")
    @ResponseBody
    public String taskSelect(Long id){
        Task task = taskService.selectByPrimaryKey(id);
        return JSON.toJSONString(task);
    }

    /**
     *根据状态查询任务
     */
    @RequestMapping("/task_selectByState")
    @ResponseBody
    public String taskSelectBySate(int state){
        List<Task> tasks=taskService.selectByState(state);
        return JSON.toJSONString(tasks);
    }
    /**
     * 删除任务
     */
    @RequestMapping("/task_delete")
    @ResponseBody
    public JSONResult taskDelete(Task task){
        JSONResult jsonResult = new JSONResult();
        try{
            taskService.deleteByPrimaryKey(task.getId());
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.mark("错误");
        }
        return jsonResult;
    }
    /**
     * 修改任务
     */
    @RequestMapping("/task_update")
    @ResponseBody
    public JSONResult taskUpdate(Task task){
        JSONResult jsonResult = new JSONResult();
        try{
            taskService.updateByPrimaryKey(task);
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.mark("错误");
        }
        return jsonResult;
    }


}
