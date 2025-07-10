package com.ruoyi.project.gufei.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 transport_record
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class TransportRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 采用“出厂”首字母加年月日再加编号的方式设计，例如“CC20210731001” */
    private String recordId;

    /** 负责人姓名 */
    @Excel(name = "负责人姓名")
    private String responsibleSignature;

    /** 填表日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "填表日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fillDate;

    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
    }

    public void setResponsibleSignature(String responsibleSignature) 
    {
        this.responsibleSignature = responsibleSignature;
    }

    public String getResponsibleSignature() 
    {
        return responsibleSignature;
    }

    public void setFillDate(Date fillDate) 
    {
        this.fillDate = fillDate;
    }

    public Date getFillDate() 
    {
        return fillDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("recordId", getRecordId())
            .append("responsibleSignature", getResponsibleSignature())
            .append("fillDate", getFillDate())
            .toString();
    }
}
