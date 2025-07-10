package com.ruoyi.project.gufei.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.gufei.domain.SelfutilizationOut;
import com.ruoyi.project.gufei.service.ISelfutilizationOutService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-07-08
 */
@RestController
@RequestMapping("/system/out")
public class SelfutilizationOutController extends BaseController
{
    @Autowired
    private ISelfutilizationOutService selfutilizationOutService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:out:list')")
    @GetMapping("/list")
    public TableDataInfo list(SelfutilizationOut selfutilizationOut)
    {
        startPage();
        List<SelfutilizationOut> list = selfutilizationOutService.selectSelfutilizationOutList(selfutilizationOut);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:out:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SelfutilizationOut selfutilizationOut)
    {
        List<SelfutilizationOut> list = selfutilizationOutService.selectSelfutilizationOutList(selfutilizationOut);
        ExcelUtil<SelfutilizationOut> util = new ExcelUtil<SelfutilizationOut>(SelfutilizationOut.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:out:query')")
    @GetMapping(value = "/{recordId}")
    public AjaxResult getInfo(@PathVariable("recordId") String recordId)
    {
        return success(selfutilizationOutService.selectSelfutilizationOutByRecordId(recordId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:out:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SelfutilizationOut selfutilizationOut)
    {
        return toAjax(selfutilizationOutService.insertSelfutilizationOut(selfutilizationOut));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:out:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SelfutilizationOut selfutilizationOut)
    {
        return toAjax(selfutilizationOutService.updateSelfutilizationOut(selfutilizationOut));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:out:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recordIds}")
    public AjaxResult remove(@PathVariable String[] recordIds)
    {
        return toAjax(selfutilizationOutService.deleteSelfutilizationOutByRecordIds(recordIds));
    }
}
