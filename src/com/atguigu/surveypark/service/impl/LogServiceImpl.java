package com.atguigu.surveypark.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.surveypark.dao.BaseDao;
import com.atguigu.surveypark.model.Log;
import com.atguigu.surveypark.service.LogService;

@Service("logService")
public class LogServiceImpl extends BaseServiceImpl<Log> implements
		LogService {
	
	@Resource(name="logDao")
	public void setDao(BaseDao<Log> dao) {
		super.setDao(dao);
	}
}
