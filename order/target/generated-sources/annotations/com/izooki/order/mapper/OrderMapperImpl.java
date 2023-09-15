package com.izooki.order.mapper;

import com.izooki.order.dto.FoodItemsDTO;
import com.izooki.order.dto.OrderDTO;
import com.izooki.order.entity.Order;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-15T01:36:32-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order mapOrderDTOToOrder(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setOrderId( orderDTO.getOrderId() );
        List<FoodItemsDTO> list = orderDTO.getFoodItemsList();
        if ( list != null ) {
            order.setFoodItemsList( new ArrayList<FoodItemsDTO>( list ) );
        }
        order.setRestaurant( orderDTO.getRestaurant() );
        order.setUserDTO( orderDTO.getUserDTO() );

        return order;
    }

    @Override
    public OrderDTO mapOrderToOrderDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setOrderId( order.getOrderId() );
        List<FoodItemsDTO> list = order.getFoodItemsList();
        if ( list != null ) {
            orderDTO.setFoodItemsList( new ArrayList<FoodItemsDTO>( list ) );
        }
        orderDTO.setRestaurant( order.getRestaurant() );
        orderDTO.setUserDTO( order.getUserDTO() );

        return orderDTO;
    }
}
