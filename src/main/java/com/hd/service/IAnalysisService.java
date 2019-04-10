package com.hd.service;

import com.hd.entity.response.CustomerAnalysisResponse;
import com.hd.entity.response.HealthAnalysisResponse;

public interface IAnalysisService {


    /**
     * 查询customer
     * @return
     */
    CustomerAnalysisResponse selectCustomer();

}
