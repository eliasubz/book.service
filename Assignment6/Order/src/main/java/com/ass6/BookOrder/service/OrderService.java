package com.ass6.catalogapi.service;

import com.ass6.catalogapi.api.model.Book;
import com.ass6.catalogapi.api.model.Order;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private static List<Order> OrderList;

    public OrderService() {
        OrderList = new ArrayList<>();

        Order order1 = new Order(1,1,LocalDate.of(2021,5,8));
        Order order2 = new Order(3,3,LocalDate.of(2023,6,02));
        Order order3 = new Order(4,1,LocalDate.of(2024,4,23));

        OrderList.addAll(Arrays.asList(order1,order2,order3));
    }

    public static List<Order> findAll() {
        return OrderList;
    }

    public Optional<Order> getOrder(Integer id) {
        Optional optional = Optional.empty();
        for (Order order: OrderList) {
            if(id == order.getId()) {
                optional = Optional.of(order);
                return optional;
            }
        }
        return optional;
    }

    public void addOrder(Order order) {
        OrderList.add(order);
    } //toDo notify inventory
    public void updateOrder(int id, Order order) { //toDo notify inventory
        Order currentOrder = (Order) getOrder(id).get();
        currentOrder = order;
    }

    public void deleteOrder(Order order) {
        OrderList.remove(order);
    } //toDo notify inventory
}