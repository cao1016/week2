package com.caodongwei.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.caodongwei.bean.Goods;

public interface GoodsMapper {

	List<Goods> selectGoods(Map<String, Object>map);

	int insertgoods(Goods goods);
	
	int deletegoods(@Param("id")int id);
	
	int updategoods(Goods goods);
}
