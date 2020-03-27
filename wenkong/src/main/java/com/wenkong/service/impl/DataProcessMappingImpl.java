package com.wenkong.service.impl;

import com.wenkong.mapping.DataProcessMapping;
import com.wenkong.pojo.DataProcess;
import com.wenkong.service.DataProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 张拉过程数据
 */
@Service("dataProcessService")
public class DataProcessMappingImpl implements DataProcessService {
    @Autowired
    private DataProcessMapping dataProcessMapping;
    @Override
    public List<DataProcess> query(String ltbh) {
        return dataProcessMapping.query(ltbh);
    }
}
