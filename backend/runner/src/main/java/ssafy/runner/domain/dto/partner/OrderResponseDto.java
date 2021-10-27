package ssafy.runner.domain.dto.partner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ssafy.runner.domain.dto.customer.CustomerNicknameDto;
import ssafy.runner.domain.entity.Orders;
import ssafy.runner.domain.enums.OrderStatus;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDto {

    private CustomerNicknameDto customer;
    private LocalDateTime date;
    private OrderStatus status;
    private int totalPrice;
    private String request;

    public OrderResponseDto(Orders order) {
        this.customer = new CustomerNicknameDto(order.getCustomer());
        this.date = order.getDate();
        this.status = order.getStatus();
        this.totalPrice = order.getTotalPrice();
    }
}
