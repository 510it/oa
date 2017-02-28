package com.oa.mapper;

import com.oa.domain.Approve;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApproveMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Approve record);

    Approve selectByPrimaryKey(Long id);

    List<Approve> selectAll();

    int updateByPrimaryKey(Approve record);

    List<Approve> approveListApply(String applier);

    List<Approve> approveListApprove(@Param("approver") String approver, @Param("result") int result);

    void approveConfirm(Long id);

    List<Approve> approveQueryApply(@Param("query") String query, @Param("applier") String applier,@Param("approver")String approver, @Param("result") Integer result);

    List<Approve> approveQueryConfirm(@Param("query") String query, @Param("approver") String approver, @Param("result") Integer result, @Param("applier") String applier);
}