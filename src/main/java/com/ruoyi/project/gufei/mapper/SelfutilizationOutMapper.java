package com.ruoyi.project.gufei.mapper;

import java.util.List;
import com.ruoyi.project.gufei.domain.SelfutilizationOut;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface SelfutilizationOutMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SelfutilizationOut selectSelfutilizationOutByRecordId(String recordId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param selfutilizationOut 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SelfutilizationOut> selectSelfutilizationOutList(SelfutilizationOut selfutilizationOut);

    /**
     * 新增【请填写功能名称】
     * 
     * @param selfutilizationOut 【请填写功能名称】
     * @return 结果
     */
    public int insertSelfutilizationOut(SelfutilizationOut selfutilizationOut);

    /**
     * 修改【请填写功能名称】
     * 
     * @param selfutilizationOut 【请填写功能名称】
     * @return 结果
     */
    public int updateSelfutilizationOut(SelfutilizationOut selfutilizationOut);

    /**
     * 删除【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSelfutilizationOutByRecordId(String recordId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSelfutilizationOutByRecordIds(String[] recordIds);
}
