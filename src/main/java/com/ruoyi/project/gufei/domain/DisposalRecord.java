package com.ruoyi.project.gufei.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 disposal_record
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class DisposalRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录表编号（如CZ20210731001) */
    private String disposalRecordId;

    /** 自行处置设施编码（关联排污许可证或HJ 608编码） */
    @Excel(name = "自行处置设施编码", readConverterExp = "关=联排污许可证或HJ,6=08编码")
    private String facilityCode;

    /** 自行处置部门负责人姓名 */
    @Excel(name = "自行处置部门负责人姓名")
    private String departmentHead;

    /** 填表日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "填表日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fillDate;

    public void setDisposalRecordId(String disposalRecordId) 
    {
        this.disposalRecordId = disposalRecordId;
    }

    public String getDisposalRecordId() 
    {
        return disposalRecordId;
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
            .append("disposalRecordId", getDisposalRecordId())
            .append("facilityCode", getFacilityCode())
            .append("departmentHead", getDepartmentHead())
            .append("fillDate", getFillDate())
            .toString();
    }
}
