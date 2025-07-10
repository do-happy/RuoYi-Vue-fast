package com.ruoyi.project.gufei.service;

import java.util.List;
import com.ruoyi.project.gufei.domain.DisposalRecord;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface IDisposalRecordService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param disposalRecordId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public DisposalRecord selectDisposalRecordByDisposalRecordId(String disposalRecordId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param disposalRecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DisposalRecord> selectDisposalRecordList(DisposalRecord disposalRecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param disposalRecord 【请填写功能名称】
     * @return 结果
     */
    public int insertDisposalRecord(DisposalRecord disposalRecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param disposalRecord 【请填写功能名称】
     * @return 结果
     */
    public int updateDisposalRecord(DisposalRecord disposalRecord);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param disposalRecordIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteDisposalRecordByDisposalRecordIds(String[] disposalRecordIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param disposalRecordId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDisposalRecordByDisposalRecordId(String disposalRecordId);
}
