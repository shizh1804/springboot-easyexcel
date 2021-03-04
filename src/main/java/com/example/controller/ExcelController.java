package com.example.controller;

import com.example.entity.ReportId;
import com.example.service.ExcelService;
import com.example.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
@RestController
@RequestMapping("/std")
public class ExcelController {
    @Autowired
    private ExcelService excelService;
    @RequestMapping("/excel")
   public void queryAll(HttpServletResponse response) {

        String fileName = "一个 Excel 文件";
        String sheetName = "第一个 sheet";
        ExcelUtil.writeExcel(response, excelService.queryAll(), fileName, sheetName, new ReportId());

    }

    @RequestMapping("/queryAll")
    public List<ReportId> queryAll() {
    return excelService.queryAll();
    }
}





