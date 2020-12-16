package com.fiberhome.configure;

import java.util.Map;

/**
 *  return structure
 */
public class ResponseBean {
    /**
     * state
     */
    private boolean success = true;
    /**
     * query id
     */
    private Integer queryId;
    /**
     * error message
     */
    private String errorMsg = "";
    /**
     * error code
     */
    private String errorCode = "";

    /**
     * return data
     */
    private Object data;
    /**
     * reserve attribution
     */
    private Map extendMap;
    /**
     * row count in page
     * or pageSize
     */
    private Integer pageSize;

    /**
     * row count
     */
    private Integer totalRowCount;

    public Integer getTotalRowCount() {
        return totalRowCount;
    }

    public void setTotalRowCount(Integer totalRowCount) {
        this.totalRowCount = totalRowCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ResponseBean(){
        super();
    }

    public ResponseBean(boolean success){
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getQueryId() {
        return queryId;
    }

    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Map getExtendMap() {
        return extendMap;
    }

    public void setExtendMap(Map extendMap) {
        this.extendMap = extendMap;
    }



    @Override
    public String toString() {
        return "ResponseBean{" +
                "success=" + success +
                ", queryId=" + queryId +
                ", errorMsg='" + errorMsg + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", data=" + data +
                ", extendMap=" + extendMap +
                ", pageSize=" + pageSize +
                ", totalRowCount=" + totalRowCount +
                '}';
    }
}
