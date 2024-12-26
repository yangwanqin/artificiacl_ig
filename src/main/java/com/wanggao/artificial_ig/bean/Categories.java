package com.wanggao.artificial_ig.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * categories
 */

public class Categories implements Serializable {
    private Long id;

    private String name;

    private String description;

    public Categories(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Categories() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    private static final long serialVersionUID = 1L;
}