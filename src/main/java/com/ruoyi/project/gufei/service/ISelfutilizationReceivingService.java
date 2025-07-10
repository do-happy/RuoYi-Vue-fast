package com.ruoyi.project.gufei.service;

import java.util.List;
import com.ruoyi.project.gufei.domain.SelfutilizationReceiving;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface ISelfutilizationReceivingService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param RecordID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SelfutilizationReceiving selectSelfutilizationReceivingByRecordID(String RecordID);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param selfutilizationReceiving 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SelfutilizationReceiving> selectSelfutilizationReceivingList(SelfutilizationReceiving selfutilizationReceiving);

    /**
     * 新增【请填写功能名称】
     * 
     * @param selfutilizationReceiving 【请填写功能名称】
     * @return 结果
     */
    public int insertSelfutilizationReceiving(SelfutilizationReceiving selfutilizationReceiving);

    /**
     * 修改【请填写功能名称】
     * 
     * @param selfutilizationReceiving 【请填写功能名称】
     * @return 结果
     */
    public int updateSelfutilizationReceiving(SelfutilizationReceiving selfutilizationReceiving);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param RecordIDs 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSelfutilizationReceivingByRecordIDs(String[] RecordIDs);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param RecordID 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSelfutilizationReceivingByRecordID(String RecordID);
}
