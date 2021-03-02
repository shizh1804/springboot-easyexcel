package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import com.example.entity.ReportId;

import java.util.List;

/**
 * @author Lenovo
 */
@Mapper
public interface ExcelDao {
      List<ReportId> queryAll();
}
