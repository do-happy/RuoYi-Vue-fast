package com.ruoyi.project.gufei.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 storage_in
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class StorageIn extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 入库记录唯一标识 */
    private Long inId;

    /** 关联主记录表(关联storage_records) */
    @Excel(name = "关联主记录表(关联storage_records)")
    private String recordId;

    /** 废物来源设施编码 */
    @Excel(name = "废物来源设施编码")
    private String sourceCode;

    /** 废物来源设施名称 */
    @Excel(name = "废物来源设施名称")
    private String sourceName;

    /** 前序表单编号(自用外键) */
    @Excel(name = "前序表单编号(自用外键)")
    private String previousForm;

    /** 废物代码（如HW01） */
    @Excel(name = "废物代码", readConverterExp = "如=HW01")
    private String wasteCode;

    /** 废物名称 */
    @Excel(name = "废物名称")
    private String wasteName;

    /** 入库具体时间（可按日记录） */
    @Excel(name = "入库具体时间", readConverterExp = "可=按日记录")
    private Date inTime;

    /** 入库数量（单位需单独管理） */
    @Excel(name = "入库数量", readConverterExp = "单=位需单独管理")
    private BigDecimal inQuantity;

    /** 运输经办人（连续入库时可为空） */
    @Excel(name = "运输经办人", readConverterExp = "连=续入库时可为空")
    private String transporter;

    /** 贮存部门经办人 */
    @Excel(name = "贮存部门经办人")
    private String handler;

    public void setInId(Long inId) 
    {
        this.inId = inId;
    }

    public Long getInId() 
    {
        return inId;
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

    public void setPreviousForm(String previousForm) 
    {
        this.previousForm = previousForm;
    }

    public String getPreviousForm() 
    {
        return previousForm;
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

    public void setInTime(Date inTime) 
    {
        this.inTime = inTime;
    }

    public Date getInTime() 
    {
        return inTime;
    }

    public void setInQuantity(BigDecimal inQuantity) 
    {
        this.inQuantity = inQuantity;
    }

    public BigDecimal getInQuantity() 
    {
        return inQuantity;
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
            .append("inId", getInId())
            .append("recordId", getRecordId())
            .append("sourceCode", getSourceCode())
            .append("sourceName", getSourceName())
            .append("previousForm", getPreviousForm())
            .append("wasteCode", getWasteCode())
            .append("wasteName", getWasteName())
            .append("inTime", getInTime())
            .append("inQuantity", getInQuantity())
            .append("transporter", getTransporter())
            .append("handler", getHandler())
            .toString();
    }
}
