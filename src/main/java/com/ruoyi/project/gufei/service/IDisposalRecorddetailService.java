package com.ruoyi.project.gufei.service;

import java.util.List;
import com.ruoyi.project.gufei.domain.DisposalRecorddetail;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface IDisposalRecorddetailService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public DisposalRecorddetail selectDisposalRecorddetailByRecordId(String recordId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param disposalRecorddetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DisposalRecorddetail> selectDisposalRecorddetailList(DisposalRecorddetail disposalRecorddetail);

    /**
     * 新增【请填写功能名称】
     * 
     * @param disposalRecorddetail 【请填写功能名称】
     * @return 结果
     */
    public int insertDisposalRecorddetail(DisposalRecorddetail disposalRecorddetail);

    /**
     * 修改【请填写功能名称】
     * 
     * @param disposalRecorddetail 【请填写功能名称】
     * @return 结果
     */
    public int updateDisposalRecorddetail(DisposalRecorddetail disposalRecorddetail);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param recordIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteDisposalRecorddetailByRecordIds(String[] recordIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDisposalRecorddetailByRecordId(String recordId);
}
