package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.DisposalRecordMapper;
import com.ruoyi.project.gufei.domain.DisposalRecord;
import com.ruoyi.project.gufei.service.IDisposalRecordService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class DisposalRecordServiceImpl implements IDisposalRecordService 
{
    @Autowired
    private DisposalRecordMapper disposalRecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param disposalRecordId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public DisposalRecord selectDisposalRecordByDisposalRecordId(String disposalRecordId)
    {
        return disposalRecordMapper.selectDisposalRecordByDisposalRecordId(disposalRecordId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param disposalRecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DisposalRecord> selectDisposalRecordList(DisposalRecord disposalRecord)
    {
        return disposalRecordMapper.selectDisposalRecordList(disposalRecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param disposalRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDisposalRecord(DisposalRecord disposalRecord)
    {
        return disposalRecordMapper.insertDisposalRecord(disposalRecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param disposalRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDisposalRecord(DisposalRecord disposalRecord)
    {
        return disposalRecordMapper.updateDisposalRecord(disposalRecord);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param disposalRecordIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDisposalRecordByDisposalRecordIds(String[] disposalRecordIds)
    {
        return disposalRecordMapper.deleteDisposalRecordByDisposalRecordIds(disposalRecordIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param disposalRecordId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDisposalRecordByDisposalRecordId(String disposalRecordId)
    {
        return disposalRecordMapper.deleteDisposalRecordByDisposalRecordId(disposalRecordId);
    }
}
