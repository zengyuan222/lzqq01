package com.wenkong.service;

import com.wenkong.pojo.DataProcess;
import org.springframework.stereotype.Service;
/**
 * 张拉过程数据
 */
import java.util.List;
public interface DataProcessService {
    List<DataProcess> query(String ltbh);

}
