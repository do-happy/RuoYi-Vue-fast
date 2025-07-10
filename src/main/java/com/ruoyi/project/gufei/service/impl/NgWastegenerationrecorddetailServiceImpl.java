package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.NgWastegenerationrecorddetailMapper;
import com.ruoyi.project.gufei.domain.NgWastegenerationrecorddetail;
import com.ruoyi.project.gufei.service.INgWastegenerationrecorddetailService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class NgWastegenerationrecorddetailServiceImpl implements INgWastegenerationrecorddetailService 
{
    @Autowired
    private NgWastegenerationrecorddetailMapper ngWastegenerationrecorddetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public NgWastegenerationrecorddetail selectNgWastegenerationrecorddetailByID(String ID)
    {
        return ngWastegenerationrecorddetailMapper.selectNgWastegenerationrecorddetailByID(ID);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param ngWastegenerationrecorddetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<NgWastegenerationrecorddetail> selectNgWastegenerationrecorddetailList(NgWastegenerationrecorddetail ngWastegenerationrecorddetail)
    {
        return ngWastegenerationrecorddetailMapper.selectNgWastegenerationrecorddetailList(ngWastegenerationrecorddetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param ngWastegenerationrecorddetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertNgWastegenerationrecorddetail(NgWastegenerationrecorddetail ngWastegenerationrecorddetail)
    {
        return ngWastegenerationrecorddetailMapper.insertNgWastegenerationrecorddetail(ngWastegenerationrecorddetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param ngWastegenerationrecorddetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateNgWastegenerationrecorddetail(NgWastegenerationrecorddetail ngWastegenerationrecorddetail)
    {
        return ngWastegenerationrecorddetailMapper.updateNgWastegenerationrecorddetail(ngWastegenerationrecorddetail);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param IDs 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteNgWastegenerationrecorddetailByIDs(String[] IDs)
    {
        return ngWastegenerationrecorddetailMapper.deleteNgWastegenerationrecorddetailByIDs(IDs);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param ID 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteNgWastegenerationrecorddetailByID(String ID)
    {
        return ngWastegenerationrecorddetailMapper.deleteNgWastegenerationrecorddetailByID(ID);
    }
}
