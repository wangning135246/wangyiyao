package com.hd.service.impl;


import com.hd.dao.CustomerMapper;
import com.hd.dao.HealthMapper;
import com.hd.dao.UserMapper;
import com.hd.entity.Customer;
import com.hd.entity.response.CustomerAnalysisResponse;
import com.hd.entity.response.HealthAnalysisResponse;
import com.hd.service.IAnalysisService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnalysisServiceImpl implements IAnalysisService {


    @Resource
    private CustomerMapper customerMapper;

    @Resource
    private HealthMapper healthMapper;

    @Resource
    private UserMapper userMapper;

    /**
     * 查询customer
     * @return
     */
    @Override
    public CustomerAnalysisResponse selectCustomer() {
        CustomerAnalysisResponse response = new CustomerAnalysisResponse();
        List<String> dataList = new ArrayList<>();
        List<String> valueList = new ArrayList<>();
        dataList.add("白金VIP");
        dataList.add("黄金VIP");
        dataList.add("普通VIP");
        dataList.add("普通");
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        for(Customer customer :customerMapper.selectAllCustomerRole("白金VIP")){
            oneCount++;
        }
        for(Customer customer :customerMapper.selectAllCustomerRole("黄金VIP")){
            twoCount++;
        }
        for(Customer customer :customerMapper.selectAllCustomerRole("普通VIP")){
            threeCount++;
        }
        for(Customer customer :customerMapper.selectAllCustomerRole("普通")){
            fourCount++;
        }
        valueList.add(String.valueOf(oneCount));
        valueList.add(String.valueOf(twoCount));
        valueList.add(String.valueOf(threeCount));
        valueList.add(String.valueOf(fourCount));
        response.setDataList(dataList);
        response.setValueList(valueList);
        return response;
    }

}
