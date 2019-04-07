package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StuMapper;
import com.qf.entity.Stues;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;


    @Override
    public List<Stues> queryAll() {
        return stuMapper.selectList(null);
    }
}
