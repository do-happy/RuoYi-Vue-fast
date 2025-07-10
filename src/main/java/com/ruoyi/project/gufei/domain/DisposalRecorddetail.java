package com.ruoyi.project.gufei.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 disposal_recorddetail
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class DisposalRecorddetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键自增 */
    private String recordId;

    /** Disposal_Record(主键) */
    @Excel(name = "Disposal_Record(主键)")
    private String disposalRecordId;

    /** 废物来源设备编码 */
    @Excel(name = "废物来源设备编码")
    private String sourceCode;

    /** 废物来源设备名称 */
    @Excel(name = "废物来源设备名称")
    private String sourceName;

    /** 前序表单编号（关联附表4或附表5） */
    @Excel(name = "前序表单编号", readConverterExp = "关=联附表4或附表5")
    private String priorFormId;

    /** 废物代码（如HW08等危险废物代码） */
    @Excel(name = "废物代码", readConverterExp = "如=HW08等危险废物代码")
    private String wasteCode;

    /** 废物名称（如废矿物油等） */
    @Excel(name = "废物名称", readConverterExp = "如=废矿物油等")
    private String wasteName;

    /** 接收时间（精确到分钟） */
    @Excel(name = "接收时间", readConverterExp = "精=确到分钟")
    private Date receiveTime;

    /** 接收数量 */
    @Excel(name = "接收数量")
    private BigDecimal receiveQuantity;

    /** 处置方式（如填埋、焚烧、综合利用等） */
    @Excel(name = "处置方式", readConverterExp = "如=填埋、焚烧、综合利用等")
    private String disposalMethod;

    /** 自行处置部门经办人姓名 */
    @Excel(name = "自行处置部门经办人姓名")
    private String handler;

    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
    }

    public void setDisposalRecordId(String disposalRecordId) 
    {
        this.disposalRecordId = disposalRecordId;
    }

    public String getDisposalRecordId() 
    {
        return disposalRecordId;
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

    public void setPriorFormId(String priorFormId) 
    {
        this.priorFormId = priorFormId;
    }

    public String getPriorFormId() 
    {
        return priorFormId;
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

    public void setReceiveTime(Date receiveTime) 
    {
        this.receiveTime = receiveTime;
    }

    public Date getReceiveTime() 
    {
        return receiveTime;
    }

    public void setReceiveQuantity(BigDecimal receiveQuantity) 
    {
        this.receiveQuantity = receiveQuantity;
    }

    public BigDecimal getReceiveQuantity() 
    {
        return receiveQuantity;
    }

    public void setDisposalMethod(String disposalMethod) 
    {
        this.disposalMethod = disposalMethod;
    }

    public String getDisposalMethod() 
    {
        return disposalMethod;
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
            .append("recordId", getRecordId())
            .append("disposalRecordId", getDisposalRecordId())
            .append("sourceCode", getSourceCode())
            .append("sourceName", getSourceName())
            .append("priorFormId", getPriorFormId())
            .append("wasteCode", getWasteCode())
            .append("wasteName", getWasteName())
            .append("receiveTime", getReceiveTime())
            .append("receiveQuantity", getReceiveQuantity())
            .append("disposalMethod", getDisposalMethod())
            .append("handler", getHandler())
            .toString();
    }
}
