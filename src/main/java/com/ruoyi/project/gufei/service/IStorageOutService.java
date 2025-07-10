package com.ruoyi.project.gufei.service;

import java.util.List;
import com.ruoyi.project.gufei.domain.StorageOut;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface IStorageOutService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param outId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public StorageOut selectStorageOutByOutId(Long outId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param storageOut 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<StorageOut> selectStorageOutList(StorageOut storageOut);

    /**
     * 新增【请填写功能名称】
     * 
     * @param storageOut 【请填写功能名称】
     * @return 结果
     */
    public int insertStorageOut(StorageOut storageOut);

    /**
     * 修改【请填写功能名称】
     * 
     * @param storageOut 【请填写功能名称】
     * @return 结果
     */
    public int updateStorageOut(StorageOut storageOut);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param outIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteStorageOutByOutIds(Long[] outIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param outId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteStorageOutByOutId(Long outId);
}
