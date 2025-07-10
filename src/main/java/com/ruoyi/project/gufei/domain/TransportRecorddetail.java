package com.ruoyi.project.gufei.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 transport_recorddetail
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class TransportRecorddetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID，自增 */
    private String id;

    /** Transport_Record表主键 */
    @Excel(name = "Transport_Record表主键")
    private String recordId;

    /** 废物代码（如HW08等危险废物代码） */
    @Excel(name = "废物代码", readConverterExp = "如=HW08等危险废物代码")
    private String wasteCode;

    /** 废物名称（如废矿物油等） */
    @Excel(name = "废物名称", readConverterExp = "如=废矿物油等")
    private String wasteName;

    /** 出厂时间，原则上应精确至“分” */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出厂时间，原则上应精确至“分”", width = 30, dateFormat = "yyyy-MM-dd")
    private Date departureTime;

    /** 出厂数量，原则上应以“吨”为单位计量，如以其他单位计量则应说明计量单位，并通过估算换算成以“吨”计量。 */
    @Excel(name = "出厂数量，原则上应以“吨”为单位计量，如以其他单位计量则应说明计量单位，并通过估算换算成以“吨”计量。")
    private BigDecimal departureQuantity;

    /** 出厂环节经办人 */
    @Excel(name = "出厂环节经办人")
    private String departureHandler;

    /** 运输单位 */
    @Excel(name = "运输单位")
    private String transportCompany;

    /** 运输信息，填写运输车辆车牌号码、驾驶员姓名及联系方式。 */
    @Excel(name = "运输信息，填写运输车辆车牌号码、驾驶员姓名及联系方式。")
    private String transportInfo;

    /** 运输方式，选择公路、铁路、水路。 */
    @Excel(name = "运输方式，选择公路、铁路、水路。")
    private String transportMode;

    /** 接收单位 */
    @Excel(name = "接收单位")
    private String receivingCompany;

    /** 流向类型，选择省内转移、跨省转移、越境转移。 */
    @Excel(name = "流向类型，选择省内转移、跨省转移、越境转移。")
    private String flowType;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }

    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
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

    public void setDepartureTime(Date departureTime) 
    {
        this.departureTime = departureTime;
    }

    public Date getDepartureTime() 
    {
        return departureTime;
    }

    public void setDepartureQuantity(BigDecimal departureQuantity) 
    {
        this.departureQuantity = departureQuantity;
    }

    public BigDecimal getDepartureQuantity() 
    {
        return departureQuantity;
    }

    public void setDepartureHandler(String departureHandler) 
    {
        this.departureHandler = departureHandler;
    }

    public String getDepartureHandler() 
    {
        return departureHandler;
    }

    public void setTransportCompany(String transportCompany) 
    {
        this.transportCompany = transportCompany;
    }

    public String getTransportCompany() 
    {
        return transportCompany;
    }

    public void setTransportInfo(String transportInfo) 
    {
        this.transportInfo = transportInfo;
    }

    public String getTransportInfo() 
    {
        return transportInfo;
    }

    public void setTransportMode(String transportMode) 
    {
        this.transportMode = transportMode;
    }

    public String getTransportMode() 
    {
        return transportMode;
    }

    public void setReceivingCompany(String receivingCompany) 
    {
        this.receivingCompany = receivingCompany;
    }

    public String getReceivingCompany() 
    {
        return receivingCompany;
    }

    public void setFlowType(String flowType) 
    {
        this.flowType = flowType;
    }

    public String getFlowType() 
    {
        return flowType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("recordId", getRecordId())
            .append("wasteCode", getWasteCode())
            .append("wasteName", getWasteName())
            .append("departureTime", getDepartureTime())
            .append("departureQuantity", getDepartureQuantity())
            .append("departureHandler", getDepartureHandler())
            .append("transportCompany", getTransportCompany())
            .append("transportInfo", getTransportInfo())
            .append("transportMode", getTransportMode())
            .append("receivingCompany", getReceivingCompany())
            .append("flowType", getFlowType())
            .toString();
    }
}
