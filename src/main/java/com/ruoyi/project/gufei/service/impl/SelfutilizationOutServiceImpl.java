package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.SelfutilizationOutMapper;
import com.ruoyi.project.gufei.domain.SelfutilizationOut;
import com.ruoyi.project.gufei.service.ISelfutilizationOutService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class SelfutilizationOutServiceImpl implements ISelfutilizationOutService 
{
    @Autowired
    private SelfutilizationOutMapper selfutilizationOutMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SelfutilizationOut selectSelfutilizationOutByRecordId(String recordId)
    {
        return selfutilizationOutMapper.selectSelfutilizationOutByRecordId(recordId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param selfutilizationOut 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SelfutilizationOut> selectSelfutilizationOutList(SelfutilizationOut selfutilizationOut)
    {
        return selfutilizationOutMapper.selectSelfutilizationOutList(selfutilizationOut);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param selfutilizationOut 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSelfutilizationOut(SelfutilizationOut selfutilizationOut)
    {
        return selfutilizationOutMapper.insertSelfutilizationOut(selfutilizationOut);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param selfutilizationOut 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSelfutilizationOut(SelfutilizationOut selfutilizationOut)
    {
        return selfutilizationOutMapper.updateSelfutilizationOut(selfutilizationOut);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param recordIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSelfutilizationOutByRecordIds(String[] recordIds)
    {
        return selfutilizationOutMapper.deleteSelfutilizationOutByRecordIds(recordIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSelfutilizationOutByRecordId(String recordId)
    {
        return selfutilizationOutMapper.deleteSelfutilizationOutByRecordId(recordId);
    }
}
