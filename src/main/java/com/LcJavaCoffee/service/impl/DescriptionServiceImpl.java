package com.LcJavaCoffee.service.impl;

import com.LcJavaCoffee.dao.DescriptionMapper;
import com.LcJavaCoffee.entity.Description;
import com.LcJavaCoffee.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("descriptionService")
public class DescriptionServiceImpl implements DescriptionService {
    /**
     * 获取最新一条描述
     */
    @Autowired
    private DescriptionMapper descriptionMapper;

    @Override
    public Description getLastDescription() {
        return descriptionMapper.getLastDescription();
    }
}
