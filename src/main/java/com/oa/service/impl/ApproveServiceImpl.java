package com.oa.service.impl;

import com.oa.domain.Approve;
import com.oa.mapper.ApproveMapper;
import com.oa.service.IApproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by crl on 2017/2/27.
 */
@Service
public class ApproveServiceImpl implements IApproveService {

    @Autowired
    private ApproveMapper approveMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return approveMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Approve record) {
        record.setResult(0);
        return approveMapper.insert(record);
    }

    @Override
    public Approve selectByPrimaryKey(Long id) {
        return approveMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Approve> selectAll() {
        return approveMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Approve record) {
        return approveMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Approve> approveListApply(String applier) {
        return approveMapper.approveListApply(applier);
    }

    @Override
    public List<Approve> approveListApprove(String approver,int result) {
        return approveMapper.approveListApprove(approver,result);
    }

    @Override
    public void approveConfirm(Long id) {
        approveMapper.approveConfirm(id);
    }

    @Override
    public List<Approve> approveQueryApply(String query, String applier) {
        return approveMapper.approveQueryApply(query,applier,null,null);
    }

    @Override
    public List<Approve> approveQueryConfirm(String query, String approver, int result) {
        return approveMapper.approveQueryConfirm(query,approver,result,null);
    }
}
