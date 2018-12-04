package com.LcJavaCoffee.dao;

import com.LcJavaCoffee.entity.Description;

public interface DescriptionMapper {
    /**
     * 获取最新一条描述
     * @return
     */
    Description getLastDescription();

}
