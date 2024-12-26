package com.wanggao.artificial_ig.mapper;

import com.wanggao.artificial_ig.bean.PostTagsKey;
import org.springframework.stereotype.Repository;

@Repository
public interface PostTagsMapper {
    int deleteByPrimaryKey(PostTagsKey key);

    int insert(PostTagsKey record);

    int insertSelective(PostTagsKey record);
}