package com.oa.service;

import com.oa.domain.Approve;

import java.util.List;

/**
 * Created by crl on 2017/2/27.
 */
public interface IApproveService {
    int deleteByPrimaryKey(Long id);

    int insert(Approve record);

    Approve selectByPrimaryKey(Long id);

    List<Approve> selectAll();

    int updateByPrimaryKey(Approve record);

    List<Approve> approveListApply(String applier);

    List<Approve> approveListApprove(String approver,int result);

    void approveConfirm(Long id);

    List<Approve> approveQueryApply(String query, String applier);

    List<Approve> approveQueryConfirm(String query, String approver, int result);
}
