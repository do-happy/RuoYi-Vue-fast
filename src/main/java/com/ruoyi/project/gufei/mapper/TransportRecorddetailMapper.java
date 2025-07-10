package com.ruoyi.project.gufei.mapper;

import java.util.List;
import com.ruoyi.project.gufei.domain.TransportRecorddetail;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public interface TransportRecorddetailMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TransportRecorddetail selectTransportRecorddetailById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param transportRecorddetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TransportRecorddetail> selectTransportRecorddetailList(TransportRecorddetail transportRecorddetail);

    /**
     * 新增【请填写功能名称】
     * 
     * @param transportRecorddetail 【请填写功能名称】
     * @return 结果
     */
    public int insertTransportRecorddetail(TransportRecorddetail transportRecorddetail);

    /**
     * 修改【请填写功能名称】
     * 
     * @param transportRecorddetail 【请填写功能名称】
     * @return 结果
     */
    public int updateTransportRecorddetail(TransportRecorddetail transportRecorddetail);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTransportRecorddetailById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTransportRecorddetailByIds(String[] ids);
}
