package com.example.mybaitsinterceptor.mybatis;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author liuweibo
 * @date 2019/1/8
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Pageable {

    /**
     * 第几页，默认值为1
     */
    int page = 1;

    /**
     * 每页显示数量，默认值为10
     */
    int size = 10;

    int offset;

    int limit;

    public Pageable(int page, int size) {
        if (page < 0) {
            throw new IllegalArgumentException("Page index must not be less than zero!");
        }

        if (size < 1) {
            throw new IllegalArgumentException("Page size must not be less than one!");
        }
        this.page = page;
        this.size = size;
    }

    public void setPage(int page) {
        if (page < 0) {
            throw new IllegalArgumentException("Page index must not be less than zero!");
        }
        this.page = page;
    }

    public void setSize(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("Page size must not be less than one!");
        }
        this.size = size;
    }

    public int getOffset() {
        this.offset = (this.page - 1) * this.size;
        return this.offset;
    }

    public int getLimit() {
        this.limit = this.getOffset() + this.size;
        return this.limit;
    }
}
