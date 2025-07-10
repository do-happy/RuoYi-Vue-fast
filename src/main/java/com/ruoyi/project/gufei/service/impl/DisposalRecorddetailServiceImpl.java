package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.DisposalRecorddetailMapper;
import com.ruoyi.project.gufei.domain.DisposalRecorddetail;
import com.ruoyi.project.gufei.service.IDisposalRecorddetailService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class DisposalRecorddetailServiceImpl implements IDisposalRecorddetailService 
{
    @Autowired
    private DisposalRecorddetailMapper disposalRecorddetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public DisposalRecorddetail selectDisposalRecorddetailByRecordId(String recordId)
    {
        return disposalRecorddetailMapper.selectDisposalRecorddetailByRecordId(recordId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param disposalRecorddetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DisposalRecorddetail> selectDisposalRecorddetailList(DisposalRecorddetail disposalRecorddetail)
    {
        return disposalRecorddetailMapper.selectDisposalRecorddetailList(disposalRecorddetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param disposalRecorddetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDisposalRecorddetail(DisposalRecorddetail disposalRecorddetail)
    {
        return disposalRecorddetailMapper.insertDisposalRecorddetail(disposalRecorddetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param disposalRecorddetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDisposalRecorddetail(DisposalRecorddetail disposalRecorddetail)
    {
        return disposalRecorddetailMapper.updateDisposalRecorddetail(disposalRecorddetail);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param recordIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDisposalRecorddetailByRecordIds(String[] recordIds)
    {
        return disposalRecorddetailMapper.deleteDisposalRecorddetailByRecordIds(recordIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param recordId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDisposalRecorddetailByRecordId(String recordId)
    {
        return disposalRecorddetailMapper.deleteDisposalRecorddetailByRecordId(recordId);
    }
}
