package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.StorageInMapper;
import com.ruoyi.project.gufei.domain.StorageIn;
import com.ruoyi.project.gufei.service.IStorageInService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class StorageInServiceImpl implements IStorageInService 
{
    @Autowired
    private StorageInMapper storageInMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param inId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public StorageIn selectStorageInByInId(Long inId)
    {
        return storageInMapper.selectStorageInByInId(inId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param storageIn 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<StorageIn> selectStorageInList(StorageIn storageIn)
    {
        return storageInMapper.selectStorageInList(storageIn);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param storageIn 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertStorageIn(StorageIn storageIn)
    {
        return storageInMapper.insertStorageIn(storageIn);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param storageIn 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateStorageIn(StorageIn storageIn)
    {
        return storageInMapper.updateStorageIn(storageIn);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param inIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStorageInByInIds(Long[] inIds)
    {
        return storageInMapper.deleteStorageInByInIds(inIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param inId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStorageInByInId(Long inId)
    {
        return storageInMapper.deleteStorageInByInId(inId);
    }
}
