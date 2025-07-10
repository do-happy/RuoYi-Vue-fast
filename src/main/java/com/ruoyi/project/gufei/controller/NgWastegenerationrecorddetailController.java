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
import com.ruoyi.project.gufei.domain.NgWastegenerationrecorddetail;
import com.ruoyi.project.gufei.service.INgWastegenerationrecorddetailService;
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
@RequestMapping("/system/wastegenerationrecorddetail")
public class NgWastegenerationrecorddetailController extends BaseController
{
    @Autowired
    private INgWastegenerationrecorddetailService ngWastegenerationrecorddetailService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecorddetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(NgWastegenerationrecorddetail ngWastegenerationrecorddetail)
    {
        startPage();
        List<NgWastegenerationrecorddetail> list = ngWastegenerationrecorddetailService.selectNgWastegenerationrecorddetailList(ngWastegenerationrecorddetail);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecorddetail:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NgWastegenerationrecorddetail ngWastegenerationrecorddetail)
    {
        List<NgWastegenerationrecorddetail> list = ngWastegenerationrecorddetailService.selectNgWastegenerationrecorddetailList(ngWastegenerationrecorddetail);
        ExcelUtil<NgWastegenerationrecorddetail> util = new ExcelUtil<NgWastegenerationrecorddetail>(NgWastegenerationrecorddetail.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecorddetail:query')")
    @GetMapping(value = "/{ID}")
    public AjaxResult getInfo(@PathVariable("ID") String ID)
    {
        return success(ngWastegenerationrecorddetailService.selectNgWastegenerationrecorddetailByID(ID));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecorddetail:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NgWastegenerationrecorddetail ngWastegenerationrecorddetail)
    {
        return toAjax(ngWastegenerationrecorddetailService.insertNgWastegenerationrecorddetail(ngWastegenerationrecorddetail));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecorddetail:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NgWastegenerationrecorddetail ngWastegenerationrecorddetail)
    {
        return toAjax(ngWastegenerationrecorddetailService.updateNgWastegenerationrecorddetail(ngWastegenerationrecorddetail));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:wastegenerationrecorddetail:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{IDs}")
    public AjaxResult remove(@PathVariable String[] IDs)
    {
        return toAjax(ngWastegenerationrecorddetailService.deleteNgWastegenerationrecorddetailByIDs(IDs));
    }
}
