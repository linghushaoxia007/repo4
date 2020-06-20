package com.qianfeng.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Getter
@Setter
@ToString
@Table(name = "t_product")
public class TProduct {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
    private String images;
    private Long price;
    private Long salePrice;
    private String salePoint;
    private Long typeId;
    private String typeName;
    private Boolean flag;
    @DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
    @JSONField(format="yyyy-MM-dd")//数据库导出页面时json格式化
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format="yyyy-MM-dd")
    private Date updateTime;
    private Long createUser;
    private Long updateUser;
}
