package com.qianfeng.service.impl;

import com.qianfeng.mapper.ProductMapper;
import com.qianfeng.pojo.TProduct;
import com.qianfeng.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<TProduct> getList() {
        return productMapper.selectAll();
    }

    @Override
    public TProduct getById(Long pid) {
        return productMapper.selectByPrimaryKey(pid);
    }

    @Override
    public void editProductById(TProduct pro) {
        productMapper.updateByPrimaryKey(pro);
    }

    @Override
    public void delProById(Long pid) {
        productMapper.deleteByPrimaryKey(pid);
    }
}
