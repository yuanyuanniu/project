package com.bdqn.util;

/**
 * Created by main on 2017/11/23.
 */
public class PageUtil {
    private Integer from;
    private Integer totolPage;
    private Integer count;
    private Integer pageSize;
    private Integer currPage;

    public PageUtil(Integer count, Integer pageSize, Integer currPage) {
        this.count = count;
        this.pageSize = pageSize;
        this.currPage = currPage;
        this.from = (currPage - 1) * pageSize;
        this.totolPage = count % pageSize == 0 ? count / pageSize : (count / pageSize) + 1;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTotolPage() {
        return totolPage;
    }

    public void setTotolPage(Integer totolPage) {
        this.totolPage = totolPage;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }
}
