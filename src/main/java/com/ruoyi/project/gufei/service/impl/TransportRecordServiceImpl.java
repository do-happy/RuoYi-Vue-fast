package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.TransportRecordMapper;
import com.ruoyi.project.gufei.domain.TransportRecord;
import com.ruoyi.project.gufei.service.ITransportRecordService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class TransportRecordServiceImpl implements ITransportRecordService 
{
    @Autowired
    private TransportRecordMapper transportRecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TransportRecord selectTransportRecordByRecordId(String recordId)
    {
        return transportRecordMapper.selectTransportRecordByRecordId(recordId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param transportRecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TransportRecord> selectTransportRecordList(TransportRecord transportRecord)
    {
        return transportRecordMapper.selectTransportRecordList(transportRecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param transportRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTransportRecord(TransportRecord transportRecord)
    {
        return transportRecordMapper.insertTransportRecord(transportRecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param transportRecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTransportRecord(TransportRecord transportRecord)
    {
        return transportRecordMapper.updateTransportRecord(transportRecord);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param recordIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTransportRecordByRecordIds(String[] recordIds)
    {
        return transportRecordMapper.deleteTransportRecordByRecordIds(recordIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTransportRecordByRecordId(String recordId)
    {
        return transportRecordMapper.deleteTransportRecordByRecordId(recordId);
    }
}
