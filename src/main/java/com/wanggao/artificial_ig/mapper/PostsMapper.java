package com.wanggao.artificial_ig.mapper;

import com.wanggao.artificial_ig.bean.Posts;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Posts record);

    int insertSelective(Posts record);

    Posts selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Posts record);

    int updateByPrimaryKey(Posts record);
    List<Posts> getPostsByAuthorId(Long authorId);
    List<Posts> getPostsByTagId(Long tagId);
    List<Posts> getPostsByCategoryId(Long categoryId);
    void insertPost(@Param("title") String title, @Param("content") String content,
                    @Param("authorId") Long authorId, @Param("categoryId") Long categoryId);
    void deletePost(@Param("postId") Long postId, @Param("authorId") Long authorId);

}