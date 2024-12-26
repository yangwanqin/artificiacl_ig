package com.wanggao.artificial_ig.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * post_tags
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostTagsKey implements Serializable {
    private Long postId;

    private Long tagId;

    private static final long serialVersionUID = 1L;
}