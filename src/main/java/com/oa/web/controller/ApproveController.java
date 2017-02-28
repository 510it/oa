package com.oa.web.controller;

import com.alibaba.fastjson.JSON;
import com.oa.domain.Approve;
import com.oa.service.IApproveService;
import com.oa.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by crl on 2017/2/27.
 */
@Controller
public class ApproveController {

    @Autowired
    private IApproveService approveService;

    @RequestMapping("/approve_save")
    @ResponseBody
    public JSONResult approveSave(Approve approve){
        approveService.insert(approve);
        return new JSONResult();
    }

    @RequestMapping("/approve_update")
    @ResponseBody
    public JSONResult approveUpdate(Approve approve){
        approveService.updateByPrimaryKey(approve);
        return new JSONResult();
    }

    @RequestMapping("/approve_delete")
    @ResponseBody
    public JSONResult approveDelete(Approve approve){
        approveService.deleteByPrimaryKey(approve.getId());
        return new JSONResult();
    }

    /**
     * 我发起的审批列表
     * @param applier 发起人昵称
     * @return
     */
    @RequestMapping("/approve_listApply")
    @ResponseBody
    public String approveListApply(String applier){
        List<Approve> approves=approveService.approveListApply(applier);
        return JSON.toJSONString(approves);
    }

    /**
     * 我审批的审批列表
     * @param approver 审批人昵称
     * @param result 审批状态
     * @return
     */
    @RequestMapping("/approve_listApprove")
    @ResponseBody
    public String approveListApprove(String approver,int result){
        List<Approve> approves=approveService.approveListApprove(approver,result);
        return JSON.toJSONString(approves);
    }

    /**
     * 确认审批
     * @param id 审批id
     * @return
     */
    @RequestMapping("/approve_confirm")
    @ResponseBody
    public JSONResult approveConfirm(Long id){
        approveService.approveConfirm(id);
        return new JSONResult();
    }

    /**
     * 查询我发起的
     * @param query 查询条件
     * @param applier 发起人
     * @return
     */
    @RequestMapping("/approve_queryApply")
    @ResponseBody
    public String approveQueryApply(String query,String applier){
        List<Approve> approves=approveService.approveQueryApply(query,applier);
        return JSON.toJSONString(approves);
    }

    /**
     * 查询我审批的
     * @param query 查询条件
     * @param approver 审批人
     * @param result 审批状态
     * @return
     */
    @RequestMapping("/approve_queryConfirm")
    @ResponseBody
    public String approveQueryConfirm(String query,String approver,int result){
        List<Approve> approves=approveService.approveQueryConfirm(query,approver,result);
        return JSON.toJSONString(approves);
    }
}
