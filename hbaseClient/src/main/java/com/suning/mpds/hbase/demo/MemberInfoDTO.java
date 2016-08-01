/*
 * Copyright (C), 2002-2016, 苏宁易购电子商务有限公司
 * FileName: MemberInfoDTO.java
 * Author:   14010163
 * Date:     2016年1月8日 下午3:45:37
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.suning.mpds.hbase.demo;

import com.suning.mpds.hbase.base.HBaseColumn;

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author 14010163
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MemberInfoDTO {
    
    
    @HBaseColumn(qualifier="AGE")
    private String age;
    
    @HBaseColumn(qualifier="CUST_NAME")
    private String userName;
    
    @HBaseColumn(qualifier="GENDER")
    private String gender;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    
    

}
