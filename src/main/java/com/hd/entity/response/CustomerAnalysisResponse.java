package com.hd.entity.response;

import java.util.List;

public class CustomerAnalysisResponse {

    List<String> dataList;

    List<String> valueList;

    public List<String> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }

    public List<String> getValueList() {
        return valueList;
    }

    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }
}
