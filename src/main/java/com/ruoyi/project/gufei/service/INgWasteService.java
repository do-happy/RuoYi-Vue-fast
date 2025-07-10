package com.ruoyi.project.gufei.service;

import java.util.List;
import com.ruoyi.project.gufei.domain.NgWaste;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface INgWasteService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public NgWaste selectNgWasteByID(String ID);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param ngWaste 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<NgWaste> selectNgWasteList(NgWaste ngWaste);

    /**
     * 新增【请填写功能名称】
     * 
     * @param ngWaste 【请填写功能名称】
     * @return 结果
     */
    public int insertNgWaste(NgWaste ngWaste);

    /**
     * 修改【请填写功能名称】
     * 
     * @param ngWaste 【请填写功能名称】
     * @return 结果
     */
    public int updateNgWaste(NgWaste ngWaste);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param IDs 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteNgWasteByIDs(String[] IDs);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param ID 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteNgWasteByID(String ID);
}
