package com.ruoyi.project.gufei.mapper;

import java.util.List;
import com.ruoyi.project.gufei.domain.StorageIn;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface StorageInMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param inId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public StorageIn selectStorageInByInId(Long inId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param storageIn 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<StorageIn> selectStorageInList(StorageIn storageIn);

    /**
     * 新增【请填写功能名称】
     * 
     * @param storageIn 【请填写功能名称】
     * @return 结果
     */
    public int insertStorageIn(StorageIn storageIn);

    /**
     * 修改【请填写功能名称】
     * 
     * @param storageIn 【请填写功能名称】
     * @return 结果
     */
    public int updateStorageIn(StorageIn storageIn);

    /**
     * 删除【请填写功能名称】
     * 
     * @param inId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteStorageInByInId(Long inId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param inIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStorageInByInIds(Long[] inIds);
}
