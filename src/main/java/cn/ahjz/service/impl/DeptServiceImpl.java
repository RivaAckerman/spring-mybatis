package cn.ahjz.service.impl;

import cn.ahjz.dao.DeptDao;
import cn.ahjz.pojo.Dept;
import cn.ahjz.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wind on 2018/11/12.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptDao deptDao;

    public Dept selectone(int id) {
        return deptDao.selectone(id);
    }
}
