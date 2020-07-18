package com.uestc.mall.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: yyWang
 * @create: 2020/7/18
 * @description: 订单超时取消并解锁库存的定时器
 */
@Component
public class OrderTimeOutCancelTask {
    private Logger LOGGER = LoggerFactory.getLogger(OrderTimeOutCancelTask.class);

    /**
     cron表达式：Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * 每10分钟扫描一次，扫描设定超时时间之前下的订单，如果没支付则取消该订单
     */

    @Scheduled(cron = "0 0/10 * ? *?")
    private void cancelTimeOutOrder() {
        // todo: 调用取消订单的方法。
        LOGGER.info("取消订单，并根据sku 编号释放锁定库存");
    }
}
