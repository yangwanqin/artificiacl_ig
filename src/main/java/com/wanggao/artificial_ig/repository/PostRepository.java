package com.wanggao.artificial_ig.repository;

import com.wanggao.artificial_ig.bean.PostAdd;
import com.wanggao.artificial_ig.bean.Posts;
import com.wanggao.artificial_ig.bean.User;
import com.wanggao.artificial_ig.mapper.PostsMapper;
import com.wanggao.artificial_ig.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepository {

    @Autowired
    private PostsMapper postsMapper;
    @Autowired
    private UserMapper userMapper;

    public List<Posts> getPostsByAuthorId(Long authorId) {
        return postsMapper.getPostsByAuthorId(authorId);
    }
    public List<Posts> getPostsByTagId(Long tagId) {
        return postsMapper.getPostsByTagId(tagId);
    }

    public List<Posts> getPostsByCategoryId(Long categoryId) {
        return postsMapper.getPostsByCategoryId(categoryId);
    }
    public void addPost(PostAdd postAdd) {
        User user = (User) userMapper.getUsersByUsername(postAdd.getUsername());
        if (user != null && user.getPassword().equals(postAdd.getPassword())) {
            postsMapper.insertPost(postAdd.getTitle(), postAdd.getContent(), user.getId(), postAdd.getCategoryId());
        } else {
            throw new RuntimeException("用户名或密码错误");
        }
    }
    public void deletePost(Long postId, String username, String password) {
        User user = (User) userMapper.getUsersByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            postsMapper.deletePost(postId, user.getId());
        } else {
            throw new RuntimeException("用户名或密码错误");
        }
    }
}