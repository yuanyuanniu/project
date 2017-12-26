package cn.bdqn.tang.util;

/**
 * Created by main on 2017/12/4.
 */
public class PageUtils {
    private Integer from;
    private Integer totalCount;
    private Integer pageSize;
    private Integer totolPage;
    private Integer currPageNo;



    public Integer getFrom() {
        this.setFrom(
               this.from = (currPageNo - 1) * pageSize
        );
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotolPage() {
        this.setTotolPage(
                this.totolPage = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1
        );
        return totolPage;
    }

    public void setTotolPage(Integer totolPage) {
        this.totolPage = totolPage;
    }

    public Integer getCurrPageNo() {
        return currPageNo;
    }

    public void setCurrPageNo(Integer currPageNo) {
        this.currPageNo = currPageNo;
    }
}
