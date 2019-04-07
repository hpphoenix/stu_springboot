package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

public interface IClassService {

    List<Classes> queryAll();

    Classes queryById(int classid);
}
