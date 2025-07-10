package com.ruoyi.project.gufei.mapper;

import java.util.List;
import com.ruoyi.project.gufei.domain.NgWastegenerationrecorddetail;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface NgWastegenerationrecorddetailMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public NgWastegenerationrecorddetail selectNgWastegenerationrecorddetailByID(String ID);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param ngWastegenerationrecorddetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<NgWastegenerationrecorddetail> selectNgWastegenerationrecorddetailList(NgWastegenerationrecorddetail ngWastegenerationrecorddetail);

    /**
     * 新增【请填写功能名称】
     * 
     * @param ngWastegenerationrecorddetail 【请填写功能名称】
     * @return 结果
     */
    public int insertNgWastegenerationrecorddetail(NgWastegenerationrecorddetail ngWastegenerationrecorddetail);

    /**
     * 修改【请填写功能名称】
     * 
     * @param ngWastegenerationrecorddetail 【请填写功能名称】
     * @return 结果
     */
    public int updateNgWastegenerationrecorddetail(NgWastegenerationrecorddetail ngWastegenerationrecorddetail);

    /**
     * 删除【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteNgWastegenerationrecorddetailByID(String ID);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param IDs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNgWastegenerationrecorddetailByIDs(String[] IDs);
}
