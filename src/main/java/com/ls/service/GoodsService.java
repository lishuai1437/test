package com.ls.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.ls.pojo.Brand;
import com.ls.pojo.Goods;
import com.ls.pojo.Goodskind;

public interface GoodsService {

	PageInfo<Goods> findGoodsList(int pageNum,Goods goods);

	int add(Goods goods,int bid,int sid);

	Goods findByGid(int gid);

	int update(Goods goods);

	int delete(String ids);

	List<Brand> findBrand();

	List<Goodskind> findGoodskind();
}
