package com.ruoyi.project.gufei.mapper;

import java.util.List;
import com.ruoyi.project.gufei.domain.DisposalRecorddetail;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface DisposalRecorddetailMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDisposalRecorddetailByRecordId(String recordId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDisposalRecorddetailByRecordIds(String[] recordIds);
}
