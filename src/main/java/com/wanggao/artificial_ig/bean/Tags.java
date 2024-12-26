package com.wanggao.artificial_ig.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * tags
 */

public class Tags implements Serializable {
    private Long id;

    private String name;

    public Tags(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Tags() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tags{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;
}