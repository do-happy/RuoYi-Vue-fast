package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.NgWastegenerationrecordMapper;
import com.ruoyi.project.gufei.domain.NgWastegenerationrecord;
import com.ruoyi.project.gufei.service.INgWastegenerationrecordService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class NgWastegenerationrecordServiceImpl implements INgWastegenerationrecordService 
{
    @Autowired
    private NgWastegenerationrecordMapper ngWastegenerationrecordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param RecordID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public NgWastegenerationrecord selectNgWastegenerationrecordByRecordID(String RecordID)
    {
        return ngWastegenerationrecordMapper.selectNgWastegenerationrecordByRecordID(RecordID);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param ngWastegenerationrecord 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<NgWastegenerationrecord> selectNgWastegenerationrecordList(NgWastegenerationrecord ngWastegenerationrecord)
    {
        return ngWastegenerationrecordMapper.selectNgWastegenerationrecordList(ngWastegenerationrecord);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param ngWastegenerationrecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertNgWastegenerationrecord(NgWastegenerationrecord ngWastegenerationrecord)
    {
        return ngWastegenerationrecordMapper.insertNgWastegenerationrecord(ngWastegenerationrecord);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param ngWastegenerationrecord 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateNgWastegenerationrecord(NgWastegenerationrecord ngWastegenerationrecord)
    {
        return ngWastegenerationrecordMapper.updateNgWastegenerationrecord(ngWastegenerationrecord);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param RecordIDs 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteNgWastegenerationrecordByRecordIDs(String[] RecordIDs)
    {
        return ngWastegenerationrecordMapper.deleteNgWastegenerationrecordByRecordIDs(RecordIDs);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param RecordID 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteNgWastegenerationrecordByRecordID(String RecordID)
    {
        return ngWastegenerationrecordMapper.deleteNgWastegenerationrecordByRecordID(RecordID);
    }
}
