package cn.wanlinus.helloworld.nuc;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author wanli
 * @date 2019-07-01 13:11
 */
public class NucPagation<T extends Serializable> implements Serializable {

    @JsonProperty("totalItems")
    private Integer totalItems;

    @JsonProperty("firstIndex")
    private Integer firstIndex;

    @JsonProperty("firstPage")
    private Boolean firstPage;

    @JsonProperty("lastPage")
    private Boolean lastPage;

    @JsonProperty("totalPages")
    private Integer totalPages;

    @JsonProperty("pageSize")
    private Integer pageSize;

    @JsonProperty("pageItemsCount")
    private Integer pageItemsCount;

    @JsonProperty("lastIndex")
    private Integer lastIndex;

    @JsonProperty("currentPage")
    private Integer currentPage;

    @JsonProperty("items")
    private List<T> items;

    public NucPagation() {
    }

    public NucPagation(Integer totalItems, Integer firstIndex, Boolean firstPage, Boolean lastPage, Integer totalPages, Integer pageSize, Integer pageItemsCount, Integer lastIndex, Integer currentPage, List<T> items) {
        this.totalItems = totalItems;
        this.firstIndex = firstIndex;
        this.firstPage = firstPage;
        this.lastPage = lastPage;
        this.totalPages = totalPages;
        this.pageSize = pageSize;
        this.pageItemsCount = pageItemsCount;
        this.lastIndex = lastIndex;
        this.currentPage = currentPage;
        this.items = items;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getFirstIndex() {
        return firstIndex;
    }

    public void setFirstIndex(Integer firstIndex) {
        this.firstIndex = firstIndex;
    }

    public Boolean getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(Boolean firstPage) {
        this.firstPage = firstPage;
    }

    public Boolean getLastPage() {
        return lastPage;
    }

    public void setLastPage(Boolean lastPage) {
        this.lastPage = lastPage;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageItemsCount() {
        return pageItemsCount;
    }

    public void setPageItemsCount(Integer pageItemsCount) {
        this.pageItemsCount = pageItemsCount;
    }

    public Integer getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(Integer lastIndex) {
        this.lastIndex = lastIndex;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
