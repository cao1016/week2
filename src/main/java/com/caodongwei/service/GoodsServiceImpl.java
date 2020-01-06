package com.caodongwei.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.caodongwei.bean.Goods;
import com.caodongwei.mapper.GoodsMapper;
@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsMapper gMapper;
	public List<Goods> selectGoods(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return gMapper.selectGoods(map);
	}

	public int insertgoods(Goods goods) {
		// TODO Auto-generated method stub
		return gMapper.insertgoods(goods);
	}

	public int deletegoods(int id) {
		// TODO Auto-generated method stub
		return gMapper.deletegoods(id);
	}

	public int updategoods(Goods goods) {
		// TODO Auto-generated method stub
		return gMapper.updategoods(goods);
	}

}
