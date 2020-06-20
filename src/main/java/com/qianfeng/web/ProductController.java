package com.qianfeng.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qianfeng.pojo.TProduct;
import com.qianfeng.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("list")
    public List<TProduct> getList() {
        return productService.getList();
    }

    @RequestMapping("one")
    public TProduct getById(@RequestParam Long pid){
        return productService.getById(pid);
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String editProById(TProduct pro) {
        productService.editProductById(pro);
        return "success1";
    }

    @RequestMapping(value = "delPro", method = RequestMethod.GET)
    public String delProById(Long pid) {
        productService.delProById(pid);
        return "success1";
    }

    @RequestMapping("listWithPage")
    public PageInfo<TProduct> getListWithPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TProduct> tProductList = productService.getList();
        return new PageInfo<TProduct>(tProductList);
    }
}
