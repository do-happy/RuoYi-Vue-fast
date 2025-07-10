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
import com.ruoyi.project.gufei.domain.DisposalRecord;
import com.ruoyi.project.gufei.service.IDisposalRecordService;
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
@RequestMapping("/system/record")
public class DisposalRecordController extends BaseController
{
    @Autowired
    private IDisposalRecordService disposalRecordService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(DisposalRecord disposalRecord)
    {
        startPage();
        List<DisposalRecord> list = disposalRecordService.selectDisposalRecordList(disposalRecord);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:record:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DisposalRecord disposalRecord)
    {
        List<DisposalRecord> list = disposalRecordService.selectDisposalRecordList(disposalRecord);
        ExcelUtil<DisposalRecord> util = new ExcelUtil<DisposalRecord>(DisposalRecord.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:record:query')")
    @GetMapping(value = "/{disposalRecordId}")
    public AjaxResult getInfo(@PathVariable("disposalRecordId") String disposalRecordId)
    {
        return success(disposalRecordService.selectDisposalRecordByDisposalRecordId(disposalRecordId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:record:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DisposalRecord disposalRecord)
    {
        return toAjax(disposalRecordService.insertDisposalRecord(disposalRecord));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:record:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DisposalRecord disposalRecord)
    {
        return toAjax(disposalRecordService.updateDisposalRecord(disposalRecord));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:record:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{disposalRecordIds}")
    public AjaxResult remove(@PathVariable String[] disposalRecordIds)
    {
        return toAjax(disposalRecordService.deleteDisposalRecordByDisposalRecordIds(disposalRecordIds));
    }
}
