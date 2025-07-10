package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.StorageRecordsMapper;
import com.ruoyi.project.gufei.domain.StorageRecords;
import com.ruoyi.project.gufei.service.IStorageRecordsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class StorageRecordsServiceImpl implements IStorageRecordsService 
{
    @Autowired
    private StorageRecordsMapper storageRecordsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public StorageRecords selectStorageRecordsByRecordId(String recordId)
    {
        return storageRecordsMapper.selectStorageRecordsByRecordId(recordId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param storageRecords 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<StorageRecords> selectStorageRecordsList(StorageRecords storageRecords)
    {
        return storageRecordsMapper.selectStorageRecordsList(storageRecords);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param storageRecords 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertStorageRecords(StorageRecords storageRecords)
    {
        return storageRecordsMapper.insertStorageRecords(storageRecords);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param storageRecords 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateStorageRecords(StorageRecords storageRecords)
    {
        return storageRecordsMapper.updateStorageRecords(storageRecords);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param recordIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStorageRecordsByRecordIds(String[] recordIds)
    {
        return storageRecordsMapper.deleteStorageRecordsByRecordIds(recordIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStorageRecordsByRecordId(String recordId)
    {
        return storageRecordsMapper.deleteStorageRecordsByRecordId(recordId);
    }
}
