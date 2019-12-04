package com.bw.week1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.week1.dao.GoodsMapper;
import com.bw.week1.domain.Brand;
import com.bw.week1.domain.Goods;
import com.bw.week1.domain.Type;
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper mapper;
	
	@Override
	public List<Goods> getGoodsList(String gname) {
		// TODO Auto-generated method stub
		return mapper.getGoodsList(gname);
	}

	@Override
	public void add(Goods goods) {
		// TODO Auto-generated method stub
		mapper.add(goods);
		
	}

	@Override
	public List<Type> getTypeList() {
		// TODO Auto-generated method stub
		return mapper.getTypeList();
	}

	@Override
	public List<Brand> getBrandList() {
		// TODO Auto-generated method stub
		return mapper.getBrandList();
	}

	@Override
	public Goods getGoodsByGid(Integer gid) {
		// TODO Auto-generated method stub
		return mapper.getGoodsByGid(gid);
	}

	@Override
	public void update(Goods goods) {
		// TODO Auto-generated method stub
		mapper.update(goods);
	}

	@Override
	public void delAll(String gid) {
		// TODO Auto-generated method stub
		mapper.delAll(gid);
	}

}
