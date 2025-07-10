package com.ruoyi.project.gufei.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 storage_out
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class StorageOut extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 出库记录唯一标识 */
    private Long outId;

    /** 关联主记录表（关联storage_records） */
    @Excel(name = "关联主记录表", readConverterExp = "关=联storage_records")
    private String recordId;

    /** 废物来源设施编码 */
    @Excel(name = "废物来源设施编码")
    private String sourceCode;

    /** 废物来源设施名称 */
    @Excel(name = "废物来源设施名称")
    private String sourceName;

    /** 废物代码（如HW01） */
    @Excel(name = "废物代码", readConverterExp = "如=HW01")
    private String wasteCode;

    /** 废物名称 */
    @Excel(name = "废物名称")
    private String wasteName;

    /** 出库具体时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出库具体时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date outTime;

    /** 出库数量（单位需单独管理） */
    @Excel(name = "出库数量", readConverterExp = "单=位需单独管理")
    private BigDecimal outQuantity;

    /** 废物去向（如处置单位名称+地址） */
    @Excel(name = "废物去向", readConverterExp = "如=处置单位名称+地址")
    private String destination;

    /** 运输经办人（根据实际情况填写） */
    @Excel(name = "运输经办人", readConverterExp = "根=据实际情况填写")
    private String transporter;

    /** 贮存部门经办人 */
    @Excel(name = "贮存部门经办人")
    private String handler;

    public void setOutId(Long outId) 
    {
        this.outId = outId;
    }

    public Long getOutId() 
    {
        return outId;
    }

    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
    }

    public void setSourceCode(String sourceCode) 
    {
        this.sourceCode = sourceCode;
    }

    public String getSourceCode() 
    {
        return sourceCode;
    }

    public void setSourceName(String sourceName) 
    {
        this.sourceName = sourceName;
    }

    public String getSourceName() 
    {
        return sourceName;
    }

    public void setWasteCode(String wasteCode) 
    {
        this.wasteCode = wasteCode;
    }

    public String getWasteCode() 
    {
        return wasteCode;
    }

    public void setWasteName(String wasteName) 
    {
        this.wasteName = wasteName;
    }

    public String getWasteName() 
    {
        return wasteName;
    }

    public void setOutTime(Date outTime) 
    {
        this.outTime = outTime;
    }

    public Date getOutTime() 
    {
        return outTime;
    }

    public void setOutQuantity(BigDecimal outQuantity) 
    {
        this.outQuantity = outQuantity;
    }

    public BigDecimal getOutQuantity() 
    {
        return outQuantity;
    }

    public void setDestination(String destination) 
    {
        this.destination = destination;
    }

    public String getDestination() 
    {
        return destination;
    }

    public void setTransporter(String transporter) 
    {
        this.transporter = transporter;
    }

    public String getTransporter() 
    {
        return transporter;
    }

    public void setHandler(String handler) 
    {
        this.handler = handler;
    }

    public String getHandler() 
    {
        return handler;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("outId", getOutId())
            .append("recordId", getRecordId())
            .append("sourceCode", getSourceCode())
            .append("sourceName", getSourceName())
            .append("wasteCode", getWasteCode())
            .append("wasteName", getWasteName())
            .append("outTime", getOutTime())
            .append("outQuantity", getOutQuantity())
            .append("destination", getDestination())
            .append("transporter", getTransporter())
            .append("handler", getHandler())
            .toString();
    }
}
