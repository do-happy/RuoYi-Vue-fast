package com.ruoyi.project.gufei.mapper;

import java.util.List;
import com.ruoyi.project.gufei.domain.NgWastegenerationrecord;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface NgWastegenerationrecordMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param RecordID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public NgWastegenerationrecord selectNgWastegenerationrecordByRecordID(String RecordID);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param ngWastegenerationrecord 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<NgWastegenerationrecord> selectNgWastegenerationrecordList(NgWastegenerationrecord ngWastegenerationrecord);

    /**
     * 新增【请填写功能名称】
     * 
     * @param ngWastegenerationrecord 【请填写功能名称】
     * @return 结果
     */
    public int insertNgWastegenerationrecord(NgWastegenerationrecord ngWastegenerationrecord);

    /**
     * 修改【请填写功能名称】
     * 
     * @param ngWastegenerationrecord 【请填写功能名称】
     * @return 结果
     */
    public int updateNgWastegenerationrecord(NgWastegenerationrecord ngWastegenerationrecord);

    /**
     * 删除【请填写功能名称】
     * 
     * @param RecordID 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteNgWastegenerationrecordByRecordID(String RecordID);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param RecordIDs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNgWastegenerationrecordByRecordIDs(String[] RecordIDs);
}
