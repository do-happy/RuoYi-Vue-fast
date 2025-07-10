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
import com.ruoyi.project.gufei.domain.DisposalRecorddetail;
import com.ruoyi.project.gufei.service.IDisposalRecorddetailService;
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
@RequestMapping("/system/recorddetail")
public class DisposalRecorddetailController extends BaseController
{
    @Autowired
    private IDisposalRecorddetailService disposalRecorddetailService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:recorddetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(DisposalRecorddetail disposalRecorddetail)
    {
        startPage();
        List<DisposalRecorddetail> list = disposalRecorddetailService.selectDisposalRecorddetailList(disposalRecorddetail);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:recorddetail:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DisposalRecorddetail disposalRecorddetail)
    {
        List<DisposalRecorddetail> list = disposalRecorddetailService.selectDisposalRecorddetailList(disposalRecorddetail);
        ExcelUtil<DisposalRecorddetail> util = new ExcelUtil<DisposalRecorddetail>(DisposalRecorddetail.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:recorddetail:query')")
    @GetMapping(value = "/{recordId}")
    public AjaxResult getInfo(@PathVariable("recordId") String recordId)
    {
        return success(disposalRecorddetailService.selectDisposalRecorddetailByRecordId(recordId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:recorddetail:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DisposalRecorddetail disposalRecorddetail)
    {
        return toAjax(disposalRecorddetailService.insertDisposalRecorddetail(disposalRecorddetail));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:recorddetail:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DisposalRecorddetail disposalRecorddetail)
    {
        return toAjax(disposalRecorddetailService.updateDisposalRecorddetail(disposalRecorddetail));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:recorddetail:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recordIds}")
    public AjaxResult remove(@PathVariable String[] recordIds)
    {
        return toAjax(disposalRecorddetailService.deleteDisposalRecorddetailByRecordIds(recordIds));
    }
}
