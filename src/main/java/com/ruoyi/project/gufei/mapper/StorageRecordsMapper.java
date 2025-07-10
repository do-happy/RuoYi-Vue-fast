package com.ruoyi.project.gufei.mapper;

import java.util.List;
import com.ruoyi.project.gufei.domain.StorageRecords;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface StorageRecordsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public StorageRecords selectStorageRecordsByRecordId(String recordId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param storageRecords 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<StorageRecords> selectStorageRecordsList(StorageRecords storageRecords);

    /**
     * 新增【请填写功能名称】
     * 
     * @param storageRecords 【请填写功能名称】
     * @return 结果
     */
    public int insertStorageRecords(StorageRecords storageRecords);

    /**
     * 修改【请填写功能名称】
     * 
     * @param storageRecords 【请填写功能名称】
     * @return 结果
     */
    public int updateStorageRecords(StorageRecords storageRecords);

    /**
     * 删除【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteStorageRecordsByRecordId(String recordId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStorageRecordsByRecordIds(String[] recordIds);
}
