package com.ruoyi.project.gufei.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 ng_wastegenerationrecorddetail
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class NgWastegenerationrecorddetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增长，规则：年月日+4位序号，例如20250501-0001 */
    private String ID;

    /** wasteGenerationRecord表主键id */
    @Excel(name = "wasteGenerationRecord表主键id")
    private String MainRecordID;

    /** 固体废物代码 */
    @Excel(name = "固体废物代码")
    private String wasteCode;

    /** 固体废物种类 */
    @Excel(name = "固体废物种类")
    private String wasteCategory;

    /** 固体废物名称 */
    @Excel(name = "固体废物名称")
    private String wasteName;

    /** 固体废物描述 */
    @Excel(name = "固体废物描述")
    private String wasteDescription;

    /** 固体废物类别
 0-I类废物  
1-II类废物 */
    @Excel(name = "固体废物类别 0-I类废物 1-II类废物")
    private Integer wasteType;

    /** 产生环节 */
    @Excel(name = "产生环节")
    private String productionPhase;

    /** 物理特性 */
    @Excel(name = "物理特性")
    private String physicalState;

    /** 主要成分 */
    @Excel(name = "主要成分")
    private String mainComponents;

    /** 污染特性 */
    @Excel(name = "污染特性")
    private String pollutionCharacteristic;

    /** 产废系数 */
    @Excel(name = "产废系数")
    private BigDecimal Coefficient;

    /** 产生时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "产生时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date GenerationTime;

    /** 产生数量 */
    @Excel(name = "产生数量")
    private BigDecimal GenerationQuantity;

    /** 转移时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "转移时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date TransferTime;

    /** 转移去向 */
    @Excel(name = "转移去向")
    private String TransferDestination;

    /** 产生部门经办人 */
    @Excel(name = "产生部门经办人")
    private String GenerationDepartmentOperator;

    /** 运输经办人 */
    @Excel(name = "运输经办人")
    private String TransportationOperator;

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public String getID() 
    {
        return ID;
    }

    public void setMainRecordID(String MainRecordID) 
    {
        this.MainRecordID = MainRecordID;
    }

    public String getMainRecordID() 
    {
        return MainRecordID;
    }

    public void setWasteCode(String wasteCode) 
    {
        this.wasteCode = wasteCode;
    }

    public String getWasteCode() 
    {
        return wasteCode;
    }

    public void setWasteCategory(String wasteCategory) 
    {
        this.wasteCategory = wasteCategory;
    }

    public String getWasteCategory() 
    {
        return wasteCategory;
    }

    public void setWasteName(String wasteName) 
    {
        this.wasteName = wasteName;
    }

    public String getWasteName() 
    {
        return wasteName;
    }

    public void setWasteDescription(String wasteDescription) 
    {
        this.wasteDescription = wasteDescription;
    }

    public String getWasteDescription() 
    {
        return wasteDescription;
    }

    public void setWasteType(Integer wasteType) 
    {
        this.wasteType = wasteType;
    }

    public Integer getWasteType() 
    {
        return wasteType;
    }

    public void setProductionPhase(String productionPhase) 
    {
        this.productionPhase = productionPhase;
    }

    public String getProductionPhase() 
    {
        return productionPhase;
    }

    public void setPhysicalState(String physicalState) 
    {
        this.physicalState = physicalState;
    }

    public String getPhysicalState() 
    {
        return physicalState;
    }

    public void setMainComponents(String mainComponents) 
    {
        this.mainComponents = mainComponents;
    }

    public String getMainComponents() 
    {
        return mainComponents;
    }

    public void setPollutionCharacteristic(String pollutionCharacteristic) 
    {
        this.pollutionCharacteristic = pollutionCharacteristic;
    }

    public String getPollutionCharacteristic() 
    {
        return pollutionCharacteristic;
    }

    public void setCoefficient(BigDecimal Coefficient) 
    {
        this.Coefficient = Coefficient;
    }

    public BigDecimal getCoefficient() 
    {
        return Coefficient;
    }

    public void setGenerationTime(Date GenerationTime) 
    {
        this.GenerationTime = GenerationTime;
    }

    public Date getGenerationTime() 
    {
        return GenerationTime;
    }

    public void setGenerationQuantity(BigDecimal GenerationQuantity) 
    {
        this.GenerationQuantity = GenerationQuantity;
    }

    public BigDecimal getGenerationQuantity() 
    {
        return GenerationQuantity;
    }

    public void setTransferTime(Date TransferTime) 
    {
        this.TransferTime = TransferTime;
    }

    public Date getTransferTime() 
    {
        return TransferTime;
    }

    public void setTransferDestination(String TransferDestination) 
    {
        this.TransferDestination = TransferDestination;
    }

    public String getTransferDestination() 
    {
        return TransferDestination;
    }

    public void setGenerationDepartmentOperator(String GenerationDepartmentOperator) 
    {
        this.GenerationDepartmentOperator = GenerationDepartmentOperator;
    }

    public String getGenerationDepartmentOperator() 
    {
        return GenerationDepartmentOperator;
    }

    public void setTransportationOperator(String TransportationOperator) 
    {
        this.TransportationOperator = TransportationOperator;
    }

    public String getTransportationOperator() 
    {
        return TransportationOperator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("MainRecordID", getMainRecordID())
            .append("wasteCode", getWasteCode())
            .append("wasteCategory", getWasteCategory())
            .append("wasteName", getWasteName())
            .append("wasteDescription", getWasteDescription())
            .append("wasteType", getWasteType())
            .append("productionPhase", getProductionPhase())
            .append("physicalState", getPhysicalState())
            .append("mainComponents", getMainComponents())
            .append("pollutionCharacteristic", getPollutionCharacteristic())
            .append("Coefficient", getCoefficient())
            .append("GenerationTime", getGenerationTime())
            .append("GenerationQuantity", getGenerationQuantity())
            .append("TransferTime", getTransferTime())
            .append("TransferDestination", getTransferDestination())
            .append("GenerationDepartmentOperator", getGenerationDepartmentOperator())
            .append("TransportationOperator", getTransportationOperator())
            .toString();
    }
}
