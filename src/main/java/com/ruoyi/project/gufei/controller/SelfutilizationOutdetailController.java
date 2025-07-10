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
import com.ruoyi.project.gufei.domain.SelfutilizationOutdetail;
import com.ruoyi.project.gufei.service.ISelfutilizationOutdetailService;
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
@RequestMapping("/system/outdetail")
public class SelfutilizationOutdetailController extends BaseController
{
    @Autowired
    private ISelfutilizationOutdetailService selfutilizationOutdetailService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:outdetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(SelfutilizationOutdetail selfutilizationOutdetail)
    {
        startPage();
        List<SelfutilizationOutdetail> list = selfutilizationOutdetailService.selectSelfutilizationOutdetailList(selfutilizationOutdetail);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:outdetail:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SelfutilizationOutdetail selfutilizationOutdetail)
    {
        List<SelfutilizationOutdetail> list = selfutilizationOutdetailService.selectSelfutilizationOutdetailList(selfutilizationOutdetail);
        ExcelUtil<SelfutilizationOutdetail> util = new ExcelUtil<SelfutilizationOutdetail>(SelfutilizationOutdetail.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:outdetail:query')")
    @GetMapping(value = "/{ID}")
    public AjaxResult getInfo(@PathVariable("ID") String ID)
    {
        return success(selfutilizationOutdetailService.selectSelfutilizationOutdetailByID(ID));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:outdetail:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SelfutilizationOutdetail selfutilizationOutdetail)
    {
        return toAjax(selfutilizationOutdetailService.insertSelfutilizationOutdetail(selfutilizationOutdetail));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:outdetail:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SelfutilizationOutdetail selfutilizationOutdetail)
    {
        return toAjax(selfutilizationOutdetailService.updateSelfutilizationOutdetail(selfutilizationOutdetail));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:outdetail:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{IDs}")
    public AjaxResult remove(@PathVariable String[] IDs)
    {
        return toAjax(selfutilizationOutdetailService.deleteSelfutilizationOutdetailByIDs(IDs));
    }
}
