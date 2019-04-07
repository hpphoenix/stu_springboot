package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.ClassMapper;
import com.qf.entity.Classes;
import com.qf.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClassServiceImpl implements IClassService {

    @Autowired
    private ClassMapper classMapper;


    @Override
    public List<Classes> queryAll() {
        return classMapper.selectList(null);
    }

    @Override
    public Classes queryById(int classid) {
        return classMapper.selectById(classid);
    }
}
