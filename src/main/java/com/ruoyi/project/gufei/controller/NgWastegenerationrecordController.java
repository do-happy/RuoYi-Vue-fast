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
import com.ruoyi.project.gufei.domain.NgWastegenerationrecord;
import com.ruoyi.project.gufei.service.INgWastegenerationrecordService;
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
@RequestMapping("/system/wastegenerationrecord")
public class NgWastegenerationrecordController extends BaseController
{
    @Autowired
    private INgWastegenerationrecordService ngWastegenerationrecordService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(NgWastegenerationrecord ngWastegenerationrecord)
    {
        startPage();
        List<NgWastegenerationrecord> list = ngWastegenerationrecordService.selectNgWastegenerationrecordList(ngWastegenerationrecord);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecord:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NgWastegenerationrecord ngWastegenerationrecord)
    {
        List<NgWastegenerationrecord> list = ngWastegenerationrecordService.selectNgWastegenerationrecordList(ngWastegenerationrecord);
        ExcelUtil<NgWastegenerationrecord> util = new ExcelUtil<NgWastegenerationrecord>(NgWastegenerationrecord.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecord:query')")
    @GetMapping(value = "/{RecordID}")
    public AjaxResult getInfo(@PathVariable("RecordID") String RecordID)
    {
        return success(ngWastegenerationrecordService.selectNgWastegenerationrecordByRecordID(RecordID));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecord:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NgWastegenerationrecord ngWastegenerationrecord)
    {
        return toAjax(ngWastegenerationrecordService.insertNgWastegenerationrecord(ngWastegenerationrecord));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecord:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NgWastegenerationrecord ngWastegenerationrecord)
    {
        return toAjax(ngWastegenerationrecordService.updateNgWastegenerationrecord(ngWastegenerationrecord));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecord:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{RecordIDs}")
    public AjaxResult remove(@PathVariable String[] RecordIDs)
    {
        return toAjax(ngWastegenerationrecordService.deleteNgWastegenerationrecordByRecordIDs(RecordIDs));
    }
}
