package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.NgWasteMapper;
import com.ruoyi.project.gufei.domain.NgWaste;
import com.ruoyi.project.gufei.service.INgWasteService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class NgWasteServiceImpl implements INgWasteService 
{
    @Autowired
    private NgWasteMapper ngWasteMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public NgWaste selectNgWasteByID(String ID)
    {
        return ngWasteMapper.selectNgWasteByID(ID);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param ngWaste 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<NgWaste> selectNgWasteList(NgWaste ngWaste)
    {
        return ngWasteMapper.selectNgWasteList(ngWaste);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param ngWaste 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertNgWaste(NgWaste ngWaste)
    {
        return ngWasteMapper.insertNgWaste(ngWaste);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param ngWaste 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateNgWaste(NgWaste ngWaste)
    {
        return ngWasteMapper.updateNgWaste(ngWaste);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param IDs 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteNgWasteByIDs(String[] IDs)
    {
        return ngWasteMapper.deleteNgWasteByIDs(IDs);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param ID 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteNgWasteByID(String ID)
    {
        return ngWasteMapper.deleteNgWasteByID(ID);
    }
}
