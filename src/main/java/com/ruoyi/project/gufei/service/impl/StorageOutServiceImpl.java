package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.StorageOutMapper;
import com.ruoyi.project.gufei.domain.StorageOut;
import com.ruoyi.project.gufei.service.IStorageOutService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class StorageOutServiceImpl implements IStorageOutService 
{
    @Autowired
    private StorageOutMapper storageOutMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param outId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public StorageOut selectStorageOutByOutId(Long outId)
    {
        return storageOutMapper.selectStorageOutByOutId(outId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param storageOut 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<StorageOut> selectStorageOutList(StorageOut storageOut)
    {
        return storageOutMapper.selectStorageOutList(storageOut);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param storageOut 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertStorageOut(StorageOut storageOut)
    {
        return storageOutMapper.insertStorageOut(storageOut);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param storageOut 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateStorageOut(StorageOut storageOut)
    {
        return storageOutMapper.updateStorageOut(storageOut);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param outIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStorageOutByOutIds(Long[] outIds)
    {
        return storageOutMapper.deleteStorageOutByOutIds(outIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param outId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStorageOutByOutId(Long outId)
    {
        return storageOutMapper.deleteStorageOutByOutId(outId);
    }
}
