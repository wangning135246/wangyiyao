package com.hd.service.impl;

import com.hd.dao.CustomerMapper;
import com.hd.dao.HealthMapper;
import com.hd.dao.UserMapper;
import com.hd.entity.Customer;
import com.hd.entity.Health;
import com.hd.entity.po.HealthListPo;
import com.hd.entity.request.HealthAddRequest;
import com.hd.entity.request.HealthModifyRequest;
import com.hd.entity.response.HealthListResponse;
import com.hd.service.IHealthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class HealthServiceImpl implements IHealthService {

    @Resource
    private HealthMapper healthMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private CustomerMapper customerMapper;

    /**
     * 查询健康表的一些值
     * @param name
     * @return
     */
    @Override
    public HealthListResponse selectHealthList(String name) {
        boolean boo = false;
        //查询出对应的customer
        List<Customer> customerList =  customerMapper.selectHealthCustomer(name);
       //创建对应的返回值
        HealthListResponse response = new HealthListResponse();
        //创建response对应的返回值
        List<HealthListPo> healthListPoList = new ArrayList<>();
        //循环出对应的customer
       for(Customer customer : customerList){
           HealthListPo po = new HealthListPo();
          List<Health> healthList =   healthMapper.selectHealthList(customer.getId());
          if(healthList.size() != 0){
              for(Health health:healthList){
                  po.setId(customer.getId());
                  po.setName(customer.getName());
                  po.setSex(customer.getSex());
                  po.setHeartRate(health.getHeartRate());
                  //判断血压的情况
                  if( ( ((Integer.parseInt(health.getDiastolicPressure())-80) < -10) || ((Integer.parseInt(health.getDiastolicPressure())-80) > 10) )
                          || ( ((Integer.parseInt(health.getSystolicPressure())-120) < -10) || ((Integer.parseInt(health.getSystolicPressure())-120) > 10) )) {
                      boo = true;
                      po.setBloodPressure("血压正在升高");
                  }
                  if(( ((Integer.parseInt(health.getDiastolicPressure())-80) < -20) || ((Integer.parseInt(health.getDiastolicPressure())-80) > 20) )
                          || ( ((Integer.parseInt(health.getSystolicPressure())-120) < -20) || ((Integer.parseInt(health.getSystolicPressure())-120) > 20) )){
                      boo = true;
                      po.setBloodPressure("高血压");
                  }
                  if(boo == false){
                      po.setBloodPressure("血压正常");
                  }else {
                      boo = false;
                  }
                  //胆固醇的赋值
                  po.setCholesterol(health.getCholesterol());
                  //血糖的情况
                  po.setBloodsugar(health.getBloodsugar());
                  //体重的情况
                  double height = Integer.parseInt(health.getHeight())*0.01;
                  double BMI = Integer.parseInt(health.getWeight())/(height*height);
                  if(BMI < 18.5){
                      po.setPhysicalCondition("偏瘦");
                  }else if(BMI >18.5 && BMI < 23.9){
                      po.setPhysicalCondition("正常");
                  }else if(BMI > 24 && BMI <27.9){
                      po.setPhysicalCondition("超重");
                  }else if(BMI > 28){
                      po.setPhysicalCondition("肥胖");
                  }
                  //判断腰围的指数
                  if(po.getSex().equals("男")){
                      if(Integer.parseInt(health.getWaistline()) > 85){
                          po.setWaistline("肥胖");
                      }else{
                          po.setWaistline("正常");
                      }
                  }else if(po.getSex().equals("女")){
                      if(Integer.parseInt(health.getWaistline()) > 80){
                          po.setWaistline("肥胖");
                      }else{
                          po.setWaistline("正常");
                      }
                  }
                  //创建时间
                  po.setCreatetime(health.getCreateTime());
              }
              healthListPoList.add(po);
          }
       }

       response.setData(healthListPoList);
        return response;
    }

    /**
     * 修改health方法
     * @param request
     * @return
     */
    @Override
    public int modifyHealth(HealthModifyRequest request) {
        return healthMapper.modifyHealth(request);
    }

    /**
     * 添加health
     * @param request
     * @return
     */
    @Override
    public int addHealth(HealthAddRequest request) {
        //由于前端传回的是名字
        String id = customerMapper.selectCustomerId(request.getCustomerId());
        //真正的id
        request.setCustomerId(id);
        return healthMapper.addHealth(request);
    }


}
