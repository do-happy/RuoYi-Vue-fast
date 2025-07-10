package com.ruoyi.project.gufei.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 selfutilization_outdetail
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class SelfutilizationOutdetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private String ID;

    /** SelfUtilization_Out表主键 */
    @Excel(name = "SelfUtilization_Out表主键")
    private String recordId;

    /** 利用产物名称 */
    @Excel(name = "利用产物名称")
    private String productName;

    /** 运出时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "运出时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date shipmentTime;

    /** 运出数量，精确到小数点后2位，需有单位说明 */
    @Excel(name = "运出数量，精确到小数点后2位，需有单位说明")
    private BigDecimal shipmentQuantity;

    /** 运出去向，可填企业自用、对外销售等 */
    @Excel(name = "运出去向，可填企业自用、对外销售等")
    private String shipmentDestination;

    /** 自行利用部门经办人姓名 */
    @Excel(name = "自行利用部门经办人姓名")
    private String departmentHandler;

    /** 运输经办人姓名，可填厂内或出厂运输经办人 */
    @Excel(name = "运输经办人姓名，可填厂内或出厂运输经办人")
    private String transportHandler;

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public String getID() 
    {
        return ID;
    }

    public void setRecordId(String recordId) 
    {
        this.recordId = recordId;
    }

    public String getRecordId() 
    {
        return recordId;
    }

    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }

    public void setShipmentTime(Date shipmentTime) 
    {
        this.shipmentTime = shipmentTime;
    }

    public Date getShipmentTime() 
    {
        return shipmentTime;
    }

    public void setShipmentQuantity(BigDecimal shipmentQuantity) 
    {
        this.shipmentQuantity = shipmentQuantity;
    }

    public BigDecimal getShipmentQuantity() 
    {
        return shipmentQuantity;
    }

    public void setShipmentDestination(String shipmentDestination) 
    {
        this.shipmentDestination = shipmentDestination;
    }

    public String getShipmentDestination() 
    {
        return shipmentDestination;
    }

    public void setDepartmentHandler(String departmentHandler) 
    {
        this.departmentHandler = departmentHandler;
    }

    public String getDepartmentHandler() 
    {
        return departmentHandler;
    }

    public void setTransportHandler(String transportHandler) 
    {
        this.transportHandler = transportHandler;
    }

    public String getTransportHandler() 
    {
        return transportHandler;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("recordId", getRecordId())
            .append("productName", getProductName())
            .append("shipmentTime", getShipmentTime())
            .append("shipmentQuantity", getShipmentQuantity())
            .append("shipmentDestination", getShipmentDestination())
            .append("departmentHandler", getDepartmentHandler())
            .append("transportHandler", getTransportHandler())
            .toString();
    }
}
