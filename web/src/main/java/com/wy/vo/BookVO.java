package com.wy.vo;

import lombok.Data;

/**
 * Created by wy on 2017/3/23.
 */
@Data
public class BookVO {
    private Integer id; //编号
    private String name; //名称
    private String author; //作者
    private String publisher; //出版社
    private String price; //价格
    private String image; //图片地址
    private String tag; //标签
    private Double score;//图书评分或推荐分
}