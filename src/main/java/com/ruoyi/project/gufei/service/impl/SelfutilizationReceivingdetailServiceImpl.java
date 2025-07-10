package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.SelfutilizationReceivingdetailMapper;
import com.ruoyi.project.gufei.domain.SelfutilizationReceivingdetail;
import com.ruoyi.project.gufei.service.ISelfutilizationReceivingdetailService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class SelfutilizationReceivingdetailServiceImpl implements ISelfutilizationReceivingdetailService 
{
    @Autowired
    private SelfutilizationReceivingdetailMapper selfutilizationReceivingdetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SelfutilizationReceivingdetail selectSelfutilizationReceivingdetailByID(String ID)
    {
        return selfutilizationReceivingdetailMapper.selectSelfutilizationReceivingdetailByID(ID);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param selfutilizationReceivingdetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SelfutilizationReceivingdetail> selectSelfutilizationReceivingdetailList(SelfutilizationReceivingdetail selfutilizationReceivingdetail)
    {
        return selfutilizationReceivingdetailMapper.selectSelfutilizationReceivingdetailList(selfutilizationReceivingdetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param selfutilizationReceivingdetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSelfutilizationReceivingdetail(SelfutilizationReceivingdetail selfutilizationReceivingdetail)
    {
        return selfutilizationReceivingdetailMapper.insertSelfutilizationReceivingdetail(selfutilizationReceivingdetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param selfutilizationReceivingdetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSelfutilizationReceivingdetail(SelfutilizationReceivingdetail selfutilizationReceivingdetail)
    {
        return selfutilizationReceivingdetailMapper.updateSelfutilizationReceivingdetail(selfutilizationReceivingdetail);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param IDs 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSelfutilizationReceivingdetailByIDs(String[] IDs)
    {
        return selfutilizationReceivingdetailMapper.deleteSelfutilizationReceivingdetailByIDs(IDs);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param ID 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSelfutilizationReceivingdetailByID(String ID)
    {
        return selfutilizationReceivingdetailMapper.deleteSelfutilizationReceivingdetailByID(ID);
    }
}
