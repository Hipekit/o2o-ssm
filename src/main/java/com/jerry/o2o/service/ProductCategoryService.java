package com.jerry.o2o.service;

import java.util.List;

import com.jerry.o2o.dto.ProductCategoryExecution;
import com.jerry.o2o.entity.ProductCategory;
import com.jerry.o2o.exceptions.ProductCategoryOperationException;

public interface ProductCategoryService {

	/**
	 * 查询某个店铺下的所有商品类别信息
	 * 
	 * @param shopId
	 * @return
	 */
	List<ProductCategory> getProductCategoryList(long shopId);

	/**
	 * 批量添加商品类别
	 * 
	 * @param productCategoryList
	 * @return
	 * @throws ProductCategoryOperationException
	 */
	ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList)
			throws ProductCategoryOperationException;
}
