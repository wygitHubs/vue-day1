package com.baizhi.service.impl;

import com.baizhi.dao.EmsDao;
import com.baizhi.entity.Ems;
import com.baizhi.service.EmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmsServiceImpl implements EmsService {
    @Autowired
    private EmsDao emsDao;
    @Override
    public void addEms(Ems ems) {
        emsDao.insertByEms(ems);
    }

    @Override
    public void deleteEms(Integer id) {
        emsDao.deleteById(id);
    }

    @Override
    public void changeEms(Ems ems) {
        emsDao.updateByEms(ems);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Ems queryOne(Integer id) {
        return emsDao.selectByOne(id);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Ems> queryAll() {
        return emsDao.selectAll();
    }
}
