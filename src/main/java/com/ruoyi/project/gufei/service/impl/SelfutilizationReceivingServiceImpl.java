package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.SelfutilizationReceivingMapper;
import com.ruoyi.project.gufei.domain.SelfutilizationReceiving;
import com.ruoyi.project.gufei.service.ISelfutilizationReceivingService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class SelfutilizationReceivingServiceImpl implements ISelfutilizationReceivingService 
{
    @Autowired
    private SelfutilizationReceivingMapper selfutilizationReceivingMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param RecordID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SelfutilizationReceiving selectSelfutilizationReceivingByRecordID(String RecordID)
    {
        return selfutilizationReceivingMapper.selectSelfutilizationReceivingByRecordID(RecordID);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param selfutilizationReceiving 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SelfutilizationReceiving> selectSelfutilizationReceivingList(SelfutilizationReceiving selfutilizationReceiving)
    {
        return selfutilizationReceivingMapper.selectSelfutilizationReceivingList(selfutilizationReceiving);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param selfutilizationReceiving 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSelfutilizationReceiving(SelfutilizationReceiving selfutilizationReceiving)
    {
        return selfutilizationReceivingMapper.insertSelfutilizationReceiving(selfutilizationReceiving);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param selfutilizationReceiving 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSelfutilizationReceiving(SelfutilizationReceiving selfutilizationReceiving)
    {
        return selfutilizationReceivingMapper.updateSelfutilizationReceiving(selfutilizationReceiving);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param RecordIDs 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSelfutilizationReceivingByRecordIDs(String[] RecordIDs)
    {
        return selfutilizationReceivingMapper.deleteSelfutilizationReceivingByRecordIDs(RecordIDs);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param RecordID 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSelfutilizationReceivingByRecordID(String RecordID)
    {
        return selfutilizationReceivingMapper.deleteSelfutilizationReceivingByRecordID(RecordID);
    }
}
