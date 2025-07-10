package com.ruoyi.project.gufei.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 storage_records
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class StorageRecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 采用"ZCYYYYMMDDNNN"格式，如ZC20230101001 */
    private String recordId;

    /** 排污许可证编码或HJ608标准编码 */
    @Excel(name = "排污许可证编码或HJ608标准编码")
    private String facilityCode;

    /** 贮存部门负责人姓名 */
    @Excel(name = "贮存部门负责人姓名")
    private String departmentHead;

    /** 记录表填写日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录表填写日期", width = 30, dateFormat = "yyyy-MM-dd")
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

    public void setDepartmentHead(String departmentHead) 
    {
        this.departmentHead = departmentHead;
    }

    public String getDepartmentHead() 
    {
        return departmentHead;
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
            .append("departmentHead", getDepartmentHead())
            .append("fillDate", getFillDate())
            .toString();
    }
}
