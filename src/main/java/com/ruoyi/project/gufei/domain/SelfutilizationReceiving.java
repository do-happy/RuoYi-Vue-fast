package com.ruoyi.project.gufei.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 selfutilization_receiving
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class SelfutilizationReceiving extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 可采用“接收”首字母加年月日再加编号的方式设计，例如“JS20210731001”  */
    private String RecordID;

    /** 自行利用设施编码：填写排污许可证载明的设施编码，无编码的依据HJ 608自行编码 */
    @Excel(name = "自行利用设施编码：填写排污许可证载明的设施编码，无编码的依据HJ 608自行编码")
    private String FacilityCode;

    /** 自行利用部门负责人 */
    @Excel(name = "自行利用部门负责人")
    private String Department;

    /** 填表日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "填表日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date FillingDate;

    public void setRecordID(String RecordID) 
    {
        this.RecordID = RecordID;
    }

    public String getRecordID() 
    {
        return RecordID;
    }

    public void setFacilityCode(String FacilityCode) 
    {
        this.FacilityCode = FacilityCode;
    }

    public String getFacilityCode() 
    {
        return FacilityCode;
    }

    public void setDepartment(String Department) 
    {
        this.Department = Department;
    }

    public String getDepartment() 
    {
        return Department;
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
            .append("FacilityCode", getFacilityCode())
            .append("Department", getDepartment())
            .append("FillingDate", getFillingDate())
            .toString();
    }
}
