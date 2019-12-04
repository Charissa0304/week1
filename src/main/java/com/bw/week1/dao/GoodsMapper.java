package com.bw.week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.week1.domain.Brand;
import com.bw.week1.domain.Goods;
import com.bw.week1.domain.Type;

/**
 * 
    * @ClassName: GoodsMapper
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author YWY
    * @date 2019年12月3日
    *
 */
public interface GoodsMapper {
	
	List<Goods> getGoodsList(@Param("gname")String gname);
	
	List<Type> getTypeList();
	
	List<Brand> getBrandList();
	
	void add(Goods goods);

	Goods getGoodsByGid(@Param("gid")Integer gid);
	
	void update(Goods goods);
	
	void delAll(@Param("gid")String  gid);

}
