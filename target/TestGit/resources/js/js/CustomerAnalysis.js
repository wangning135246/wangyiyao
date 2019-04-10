$(document).ready(function() {

    selectCustomer();

});

function selectCustomer(){
    $.ajax({
        url : '/analysis/selectCustomer',
        type : 'post',
        cache : false,
        dataType : 'json',
        success : function(data) {

            if (data != null  ) {

                var myChart = echarts.init(document.getElementById('importMain'));
                var dateList = data.dataList;
                var valueList = data.valueList;
                var one,two,three,four;
                $.each(valueList, function(index, item){
                    if(index == 0){
                        one = item;
                    }else if(index == 1){
                        two = item;
                    }else if(index == 2){
                        three = item;
                    }else {
                        four = item;
                    }
                });
                option = {
                    title : {
                        text: '客户的会员情况',
                        subtext: '纯属虚构',
                        x:'center'
                    },
                    tooltip : {
                        trigger: 'item',
                        formatter: "{a} <br/>{b} : {c} ({d}%)"
                    },
                    legend: {
                        orient: 'vertical',
                        left: 'left',
                        data:dateList
                    },
                    series : [
                        {
                            name: '访问来源',
                            type: 'pie',
                            radius : '55%',
                            center: ['50%', '60%'],
                            data:[
                                {value:one, name:'白金VIP'},
                                {value:two, name:'黄金VIP'},
                                {value:three, name:'普通VIP'},
                                {value:four, name:'普通'},
                            ],
                            itemStyle: {
                                emphasis: {
                                    shadowBlur: 10,
                                    shadowOffsetX: 0,
                                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                                }
                            }
                        }
                    ]
                };
                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);

            }else{$('#importMain').html('无数据')}
        },

    });
}
