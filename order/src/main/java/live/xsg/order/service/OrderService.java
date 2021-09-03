package live.xsg.order.service;

import live.xsg.order.entity.Order;
import live.xsg.order.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class OrderService {
    @Resource
    private OrderRepository orderRepository;

    @Transactional
    public Order createOrder(Integer orderId, Integer memberId, Integer goodsId, Integer quantity) {
        return orderRepository.save(new Order(orderId, memberId, goodsId, quantity));
    }
}