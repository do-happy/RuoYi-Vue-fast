package com.ruoyi.project.gufei.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 ng_wastegenerationrecord
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class NgWastegenerationrecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录表编号，采用“产生”首字母加年月日再加编号的方式设计，例如“CS20210731001” */
    private String RecordID;

    /** 生产设施编码 */
    @Excel(name = "生产设施编码")
    private String ProductionFacilityCode;

    /** 废物产生部门负责人 */
    @Excel(name = "废物产生部门负责人")
    private String DepartmentHead;

    /** 填报日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "填报日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date FillingDate;

    public void setRecordID(String RecordID) 
    {
        this.RecordID = RecordID;
    }

    public String getRecordID() 
    {
        return RecordID;
    }

    public void setProductionFacilityCode(String ProductionFacilityCode) 
    {
        this.ProductionFacilityCode = ProductionFacilityCode;
    }

    public String getProductionFacilityCode() 
    {
        return ProductionFacilityCode;
    }

    public void setDepartmentHead(String DepartmentHead) 
    {
        this.DepartmentHead = DepartmentHead;
    }

    public String getDepartmentHead() 
    {
        return DepartmentHead;
    }

    public void setFillingDate(Date FillingDate) 
    {
        this.FillingDate = FillingDate;
    }

    public Date getFillingDate() 
    {
        return FillingDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("RecordID", getRecordID())
            .append("ProductionFacilityCode", getProductionFacilityCode())
            .append("DepartmentHead", getDepartmentHead())
            .append("FillingDate", getFillingDate())
            .toString();
    }
}
