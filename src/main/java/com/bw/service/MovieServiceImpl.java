package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.mapper.MovieMapperDao;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Resource
	private MovieMapperDao movieMapperDao;
	
	@Override
	public List<Map<String, Object>> getShopList() {
		return movieMapperDao.getShopList();
	}

}
