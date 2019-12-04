package com.bw.week1.service;

import java.util.List;
import com.bw.week1.domain.Brand;
import com.bw.week1.domain.Goods;
import com.bw.week1.domain.Type;
/**
 * 
    * @ClassName: GoodsService
    * @Description: ҵ���
    * @author YWY
    * @date 2019��12��3��
    *
 */
public interface GoodsService {
	/**
	 * 
	    * @Title: getGoodsList
	    * @Description:�б�
	    * @param @param gname
	    * @param @return    ����
	    * @return List<Goods>    ��������
	    * @throws
	 */
	List<Goods> getGoodsList(String gname);
/**
 * 
    * @Title: getTypeList
    * @Description: ��ѯ����
    * @param @return    ����
    * @return List<Type>    ��������
    * @throws
 */
	List<Type> getTypeList();
	/**
	 * 
	    * @Title: getBrandList
	    * @Description:��ѯƷ��
	    * @param @return    ����
	    * @return List<Brand>    ��������
	    * @throws
	 */
	List<Brand> getBrandList();
	/**
	 * 
	    * @Title: add
	    * @Description: ���
	    * @param @param goods    ����
	    * @return void    ��������
	    * @throws
	 */
    void add(Goods goods);
    /**
     * 
        * @Title: getGoodsByGid
        * @Description: ���������ѯgid
        * @param @param gid
        * @param @return    ����
        * @return Goods    ��������
        * @throws
     */
    Goods getGoodsByGid(Integer gid);
	/**
	 * 
	    * @Title: update
	    * @Description: �޸�
	    * @param @param goods    ����
	    * @return void    ��������
	    * @throws
	 */
	void update(Goods goods);
	/**
	 * 
	    * @Title: delAll
	    * @Description: ����ɾ��
	    * @param @param gid    ����
	    * @return void    ��������
	    * @throws
	 */
	void delAll(String  gid);
}
