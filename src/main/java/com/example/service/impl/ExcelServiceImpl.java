package com.example.service.impl;

import com.example.dao.ExcelDao;
import com.example.entity.ReportId;
import com.example.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExcelServiceImpl implements ExcelService {
    @Autowired
    private ExcelDao excelDao;
    @Override
    public List<ReportId> queryAll() {

        return excelDao.queryAll();
    }
}

