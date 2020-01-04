package com.ls.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ls.pojo.Brand;
import com.ls.pojo.Goods;
import com.ls.pojo.Goodskind;

public interface GoodsDao {

	List<Goods> findGoodsList(Goods goods);
	
	List<Brand> findBrand();
	
	List<Goodskind> findGoodskind();

	int add(Goods goods,@Param("bid")int bid,@Param("sid")int sid);

	Goods findByGid(int gid);

	int update(Goods goods);

	int delete(String ids);
}
