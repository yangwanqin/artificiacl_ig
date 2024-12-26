package com.wanggao.artificial_ig.controller;

import com.wanggao.artificial_ig.bean.PostAdd;
import com.wanggao.artificial_ig.bean.Posts;
import com.wanggao.artificial_ig.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Posts> getPostsByAuthorId(@RequestParam("authorId") Long authorId) {
        return postService.getPostsByAuthorId(authorId);
    }
    @GetMapping("/posts/byTag")
    public List<Posts> getPostsByTagId(@RequestParam("tagId") Long tagId) {
        return postService.getPostsByTagId(tagId);
    }

    @GetMapping("/posts/byCategory")
    public List<Posts> getPostsByCategoryId(@RequestParam("categoryId") Long categoryId) {
        return postService.getPostsByCategoryId(categoryId);
    }
    @PostMapping("/add")
    public String addPost(@RequestBody PostAdd postAdd) {
        try {
            postService.addPost(postAdd);
            return "文章添加成功";
        } catch (Exception e) {
            return "文章添加失败: " + e.getMessage();
        }
    }
    @DeleteMapping("/delete")
    public String deletePost(@RequestParam Long postId, @RequestParam String username, @RequestParam String password) {
        try {
            postService.deletePost(postId, username, password);
            return "文章删除成功";
        } catch (Exception e) {
            return "文章删除失败: " + e.getMessage();
        }
    }
}