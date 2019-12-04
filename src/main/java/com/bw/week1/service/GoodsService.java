package com.bw.week1.service;

import java.util.List;
import com.bw.week1.domain.Brand;
import com.bw.week1.domain.Goods;
import com.bw.week1.domain.Type;
/**
 * 
    * @ClassName: GoodsService
    * @Description: 业务层
    * @author YWY
    * @date 2019年12月3日
    *
 */
public interface GoodsService {
	/**
	 * 
	    * @Title: getGoodsList
	    * @Description:列表
	    * @param @param gname
	    * @param @return    参数
	    * @return List<Goods>    返回类型
	    * @throws
	 */
	List<Goods> getGoodsList(String gname);
/**
 * 
    * @Title: getTypeList
    * @Description: 查询类型
    * @param @return    参数
    * @return List<Type>    返回类型
    * @throws
 */
	List<Type> getTypeList();
	/**
	 * 
	    * @Title: getBrandList
	    * @Description:查询品牌
	    * @param @return    参数
	    * @return List<Brand>    返回类型
	    * @throws
	 */
	List<Brand> getBrandList();
	/**
	 * 
	    * @Title: add
	    * @Description: 添加
	    * @param @param goods    参数
	    * @return void    返回类型
	    * @throws
	 */
    void add(Goods goods);
    /**
     * 
        * @Title: getGoodsByGid
        * @Description: 根据主表查询gid
        * @param @param gid
        * @param @return    参数
        * @return Goods    返回类型
        * @throws
     */
    Goods getGoodsByGid(Integer gid);
	/**
	 * 
	    * @Title: update
	    * @Description: 修改
	    * @param @param goods    参数
	    * @return void    返回类型
	    * @throws
	 */
	void update(Goods goods);
	/**
	 * 
	    * @Title: delAll
	    * @Description: 批量删除
	    * @param @param gid    参数
	    * @return void    返回类型
	    * @throws
	 */
	void delAll(String  gid);
}
