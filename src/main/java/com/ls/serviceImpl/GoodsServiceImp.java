package com.ls.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ls.dao.GoodsDao;
import com.ls.pojo.Brand;
import com.ls.pojo.Goods;
import com.ls.pojo.Goodskind;
import com.ls.service.GoodsService;

@Service
public class GoodsServiceImp implements GoodsService {

	@Autowired
	GoodsDao gd;
	
	@Override
	public PageInfo<Goods> findGoodsList(int pageNum,Goods goods) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = gd.findGoodsList(goods);
		for (Goods goods2 : list) {
			System.out.println(goods2);
		}
		PageInfo<Goods> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	@Override
	public int add(Goods goods,int bid,int sid) {
		// TODO Auto-generated method stub
		int add = gd.add(goods,bid,sid);
		return add;
	}

	@Override
	public Goods findByGid(int gid) {
		// TODO Auto-generated method stub
		Goods findByGid = gd.findByGid(gid);
		return findByGid;
	}

	@Override
	public int update(Goods goods) {
		// TODO Auto-generated method stub
		int update = gd.update(goods);
		return update;
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		int delete = gd.delete(ids);
		return delete;
	}

	@Override
	public List<Brand> findBrand() {
		// TODO Auto-generated method stub
		List<Brand> findBrand = gd.findBrand();
		return findBrand;
	}

	@Override
	public List<Goodskind> findGoodskind() {
		// TODO Auto-generated method stub
		List<Goodskind> findGoodskind = gd.findGoodskind();
		return findGoodskind;
	}

}
