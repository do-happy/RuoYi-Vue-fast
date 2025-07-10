package com.ruoyi.project.gufei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.gufei.mapper.TransportRecorddetailMapper;
import com.ruoyi.project.gufei.domain.TransportRecorddetail;
import com.ruoyi.project.gufei.service.ITransportRecorddetailService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@Service
public class TransportRecorddetailServiceImpl implements ITransportRecorddetailService 
{
    @Autowired
    private TransportRecorddetailMapper transportRecorddetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TransportRecorddetail selectTransportRecorddetailById(String id)
    {
        return transportRecorddetailMapper.selectTransportRecorddetailById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param transportRecorddetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TransportRecorddetail> selectTransportRecorddetailList(TransportRecorddetail transportRecorddetail)
    {
        return transportRecorddetailMapper.selectTransportRecorddetailList(transportRecorddetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param transportRecorddetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTransportRecorddetail(TransportRecorddetail transportRecorddetail)
    {
        return transportRecorddetailMapper.insertTransportRecorddetail(transportRecorddetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param transportRecorddetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTransportRecorddetail(TransportRecorddetail transportRecorddetail)
    {
        return transportRecorddetailMapper.updateTransportRecorddetail(transportRecorddetail);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTransportRecorddetailByIds(String[] ids)
    {
        return transportRecorddetailMapper.deleteTransportRecorddetailByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTransportRecorddetailById(String id)
    {
        return transportRecorddetailMapper.deleteTransportRecorddetailById(id);
    }
}
