package com.ruoyi.project.gufei.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 selfutilization_out
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class SelfutilizationOut extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录表编号，可按“运出”首字母加年月日再加编号设计，如“YC20210731001”， */
    private String recordId;

    /** 自行利用设施编码 */
    @Excel(name = "自行利用设施编码")
    private String facilityCode;

    /** 自行利用部门负责人姓名 */
    @Excel(name = "自行利用部门负责人姓名")
    private String departmentLeader;

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

    public void setFacilityCode(String facilityCode) 
    {
        this.facilityCode = facilityCode;
    }

    public String getFacilityCode() 
    {
        return facilityCode;
    }

    public void setDepartmentLeader(String departmentLeader) 
    {
        this.departmentLeader = departmentLeader;
    }

    public String getDepartmentLeader() 
    {
        return departmentLeader;
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
            .append("facilityCode", getFacilityCode())
            .append("departmentLeader", getDepartmentLeader())
            .append("fillDate", getFillDate())
            .toString();
    }
}
