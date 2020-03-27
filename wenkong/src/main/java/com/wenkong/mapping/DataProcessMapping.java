package com.wenkong.mapping;

import com.wenkong.pojo.DataProcess;
import org.springframework.stereotype.Repository;
/**
 * 张拉过程数据
 */
import java.util.List;
@Repository
public interface DataProcessMapping {
    List<DataProcess> query(String ltbh);
}
