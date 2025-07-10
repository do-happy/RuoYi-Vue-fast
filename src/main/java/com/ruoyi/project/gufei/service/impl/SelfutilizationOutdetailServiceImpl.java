package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.SelfutilizationOutdetailMapper;
import com.ruoyi.project.gufei.domain.SelfutilizationOutdetail;
import com.ruoyi.project.gufei.service.ISelfutilizationOutdetailService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class SelfutilizationOutdetailServiceImpl implements ISelfutilizationOutdetailService 
{
    @Autowired
    private SelfutilizationOutdetailMapper selfutilizationOutdetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SelfutilizationOutdetail selectSelfutilizationOutdetailByID(String ID)
    {
        return selfutilizationOutdetailMapper.selectSelfutilizationOutdetailByID(ID);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param selfutilizationOutdetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SelfutilizationOutdetail> selectSelfutilizationOutdetailList(SelfutilizationOutdetail selfutilizationOutdetail)
    {
        return selfutilizationOutdetailMapper.selectSelfutilizationOutdetailList(selfutilizationOutdetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param selfutilizationOutdetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSelfutilizationOutdetail(SelfutilizationOutdetail selfutilizationOutdetail)
    {
        return selfutilizationOutdetailMapper.insertSelfutilizationOutdetail(selfutilizationOutdetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param selfutilizationOutdetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSelfutilizationOutdetail(SelfutilizationOutdetail selfutilizationOutdetail)
    {
        return selfutilizationOutdetailMapper.updateSelfutilizationOutdetail(selfutilizationOutdetail);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param IDs 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSelfutilizationOutdetailByIDs(String[] IDs)
    {
        return selfutilizationOutdetailMapper.deleteSelfutilizationOutdetailByIDs(IDs);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param ID 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSelfutilizationOutdetailByID(String ID)
    {
        return selfutilizationOutdetailMapper.deleteSelfutilizationOutdetailByID(ID);
    }
}
