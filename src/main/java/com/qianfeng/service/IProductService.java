package com.qianfeng.service;

import com.qianfeng.pojo.TProduct;

import java.util.List;

public interface IProductService {

    List<TProduct> getList();

    TProduct getById(Long pid);

    void editProductById(TProduct pro);

    void delProById(Long pid);
}
