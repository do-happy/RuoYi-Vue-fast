package com.ruoyi.project.gufei.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 ng_waste
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
public class NgWaste extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键标识 */
    private String ID;

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

    /** 0-I类废物  
1-II类废物 */
    @Excel(name = "0-I类废物 1-II类废物")
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

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public String getID() 
    {
        return ID;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("wasteCode", getWasteCode())
            .append("wasteCategory", getWasteCategory())
            .append("wasteName", getWasteName())
            .append("wasteDescription", getWasteDescription())
            .append("wasteType", getWasteType())
            .append("productionPhase", getProductionPhase())
            .append("physicalState", getPhysicalState())
            .append("mainComponents", getMainComponents())
            .append("pollutionCharacteristic", getPollutionCharacteristic())
            .toString();
    }
}
