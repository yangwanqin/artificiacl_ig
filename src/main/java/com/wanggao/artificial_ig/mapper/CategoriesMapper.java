package com.wanggao.artificial_ig.mapper;

import com.wanggao.artificial_ig.bean.Categories;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Categories record);

    int insertSelective(Categories record);

    Categories selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Categories record);

    int updateByPrimaryKey(Categories record);
}