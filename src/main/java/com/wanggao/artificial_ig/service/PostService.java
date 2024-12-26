package com.wanggao.artificial_ig.service;

import com.wanggao.artificial_ig.bean.PostAdd;
import com.wanggao.artificial_ig.bean.Posts;
import com.wanggao.artificial_ig.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    //通过点击Username去查作者文章
    public List<Posts> getPostsByAuthorId(Long authorId) {
        return postRepository.getPostsByAuthorId(authorId);
    }
    //通过标签 ID 查找文章
    public List<Posts> getPostsByTagId(Long tagId) {
        return postRepository.getPostsByTagId(tagId);
    }
    //通过方向 ID 查找文章
    public List<Posts> getPostsByCategoryId(Long categoryId) {
        return postRepository.getPostsByCategoryId(categoryId);
    }
    //通过用户登录去增加文章
    public void addPost(PostAdd postAdd) {
        postRepository.addPost(postAdd);
    }
    //通过用户登录去删除文章
    public void deletePost(Long postId, String username, String password) {
        postRepository.deletePost(postId, username, password);
    }
}