package com.qianfeng;

import com.qianfeng.mapper.ProductMapper;
import com.qianfeng.pojo.TProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Test1Application.class)
public class MybatisTest {

    @Autowired
    private ProductMapper productMapper;
    @Test
    public void test1() {
        List<TProduct> tProducts = productMapper.selectAll();
        for (TProduct tProduct : tProducts) {
            System.out.println(tProduct);
        }
    }
}
