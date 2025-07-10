package com.ruoyi.project.gufei.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 selfutilization_receivingdetail
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class SelfutilizationReceivingdetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 按照ZC-20250503-0001格式自动生成，ZC+年月日+自增四位 */
    private String ID;

    /** 主表单号（SelfUtilization_Receiving）主键 */
    @Excel(name = "主表单号", readConverterExp = "S=elfUtilization_Receiving")
    private String RecordID;

    /** 废物来源设备编码 */
    @Excel(name = "废物来源设备编码")
    private String sourceCode;

    /** 废物来源设备名称 */
    @Excel(name = "废物来源设备名称")
    private String sourceName;

    /** 前序表单编号：如废物来自生产环节，则填写附表4的记录表编号；如废物来自贮存环节，则填写附表5的记录表编号 */
    @Excel(name = "前序表单编号：如废物来自生产环节，则填写附表4的记录表编号；如废物来自贮存环节，则填写附表5的记录表编号")
    private String previousForm;

    /** 代码 */
    @Excel(name = "代码")
    private String wasteCode;

    /** 名称 */
    @Excel(name = "名称")
    private String wasteName;

    /** 接收时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "接收时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date receivingTime;

    /** 接收数量（单位） */
    @Excel(name = "接收数量", readConverterExp = "单=位")
    private BigDecimal quantity;

    /** 运输经办人 */
    @Excel(name = "运输经办人")
    private String transportationOperator;

    /** 自行利用部门经办人 */
    @Excel(name = "自行利用部门经办人")
    private String department;

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public String getID() 
    {
        return ID;
    }

    public void setRecordID(String RecordID) 
    {
        this.RecordID = RecordID;
    }

    public String getRecordID() 
    {
        return RecordID;
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

    public void setReceivingTime(Date receivingTime) 
    {
        this.receivingTime = receivingTime;
    }

    public Date getReceivingTime() 
    {
        return receivingTime;
    }

    public void setQuantity(BigDecimal quantity) 
    {
        this.quantity = quantity;
    }

    public BigDecimal getQuantity() 
    {
        return quantity;
    }

    public void setTransportationOperator(String transportationOperator)
    {
        this.transportationOperator = transportationOperator;
    }

    public String getTransportationOperator()
    {
        return transportationOperator;
    }

    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("RecordID", getRecordID())
            .append("sourceCode", getSourceCode())
            .append("sourceName", getSourceName())
            .append("previousForm", getPreviousForm())
            .append("wasteCode", getWasteCode())
            .append("wasteName", getWasteName())
            .append("receivingTime", getReceivingTime())
            .append("quantity", getQuantity())
            .append("transportation operator", getTransportationOperator())
            .append("department", getDepartment())
            .toString();
    }
}
