package com.ruoyi.project.gufei.mapper;

import java.util.List;
import com.ruoyi.project.gufei.domain.SelfutilizationOutdetail;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface SelfutilizationOutdetailMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SelfutilizationOutdetail selectSelfutilizationOutdetailByID(String ID);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param selfutilizationOutdetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SelfutilizationOutdetail> selectSelfutilizationOutdetailList(SelfutilizationOutdetail selfutilizationOutdetail);

    /**
     * 新增【请填写功能名称】
     * 
     * @param selfutilizationOutdetail 【请填写功能名称】
     * @return 结果
     */
    public int insertSelfutilizationOutdetail(SelfutilizationOutdetail selfutilizationOutdetail);

    /**
     * 修改【请填写功能名称】
     * 
     * @param selfutilizationOutdetail 【请填写功能名称】
     * @return 结果
     */
    public int updateSelfutilizationOutdetail(SelfutilizationOutdetail selfutilizationOutdetail);

    /**
     * 删除【请填写功能名称】
     * 
     * @param ID 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSelfutilizationOutdetailByID(String ID);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param IDs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSelfutilizationOutdetailByIDs(String[] IDs);
}
