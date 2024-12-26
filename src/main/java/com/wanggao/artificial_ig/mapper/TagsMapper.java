package com.wanggao.artificial_ig.mapper;

import com.wanggao.artificial_ig.bean.Tags;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tags record);

    int insertSelective(Tags record);

    Tags selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);
}