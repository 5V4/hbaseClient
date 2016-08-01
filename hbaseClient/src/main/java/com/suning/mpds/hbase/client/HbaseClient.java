/*
 * Copyright (C), 2002-2016, 苏宁易购电子商务有限公司
 * FileName: HbaseClient.java
 * Author:   14010163
 * Date:     2016年1月11日 上午10:39:16
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.suning.mpds.hbase.client;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.hbase.filter.Filter;


/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 14010163
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface HbaseClient {
    
    /**
     * 
     * 功能描述: <br>
     * 〈功能详细描述〉
     *
     * @param tableName  表名
     * @param rowKey   键
     * @param requiredType 类类型
     * @return
     * @throws IOException 
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    <T> T queryForObject(String tableName, String rowKey, Class<T> requiredType);
    
    /**
     * 
     * @param tableName
     * @param startRow
     * @param endRow
     * @param requiredType
     * @return
     */
    <T> List<T> queryForList(String tableName, String startRow,String endRow,Filter filter ,Class<T> requiredType);
}
