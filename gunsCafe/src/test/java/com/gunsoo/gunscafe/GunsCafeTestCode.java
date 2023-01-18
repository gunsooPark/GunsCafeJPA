package com.gunsoo.gunscafe;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Transactional
public class GunsCafeTestCode {

//    @Autowired
//    private UserService userService;
//    @Autowired
//    private ItemService itemService;
//    @Autowired
//    private OrdersService ordersService;
//    @Autowired
//    private OrdersItemService ordersItemService;
//
//    @Test
//    @DisplayName("회원가입 testCode ")
//    @Rollback(false)
//    @Order(1)
//    void insertUser(){
//        Users users = new Users();
//        users.setId("98yippp");
//        users.setName("홍길동");
//        users.setPassword("12345");
//        users.setPhoneNumber("010-1234-5678");
//        users.setRanking("bronze");
//        users.setPoint(0);
//        users.setDate(new Date());
//
//        Users users2 = new Users();
//        users2.setId("yippp");
//        users2.setName("박길동");
//        users2.setPassword("54321");
//        users2.setPhoneNumber("010-1234-5678");
//        users2.setRanking("bronze");
//        users2.setPoint(0);
//        users2.setDate(new Date());
//
//        userService.insertUser(users);
//        userService.insertUser(users2);
//    }
//
//    @Test
//    @DisplayName("물품 등록 testCode")
//    @Rollback(false)
//    @Order(2)
//    void insertItem(){
//
//        Items item1 = new Items();
//        item1.setName("아이스아메리카노");
//        item1.setPrice(2000);
//        item1.setCategory("coffie");
//        item1.setStock(10);
//
//        Items item2 = new Items();
//        item2.setName("아이스라떼");
//        item2.setPrice(3000);
//        item2.setCategory("coffie");
//        item2.setStock(10);
//
//        Items item3 = new Items();
//        item3.setName("아이스티");
//        item3.setPrice(2000);
//        item3.setCategory("tea");
//        item3.setStock(10);
//
//        Items item4 = new Items();
//        item4.setName("밀크티");
//        item4.setPrice(3500);
//        item4.setCategory("tea");
//        item4.setStock(10);
//
//        itemService.insertItem(item1);
//        itemService.insertItem(item2);
//        itemService.insertItem(item3);
//        itemService.insertItem(item4);
//    }

//    @Test
//    @DisplayName("주문 testCode")
//    @Rollback(false)
//    @Order(3)
//    void insertOrdersItem(){
//        //item id
//        //1 : 아이스아메리카노
//        //2 : 아이스라떼
//        //3 : 아이스티
//        //4 : 밀크티
//
//        //주문자 : 98yippp
//        Users users = userService.selectUser("98yippp");
//
//        //주문 음료 : 아이스아메리카노 2잔, 밀크티 1잔
//        Items item1 = itemService.selectItem(1);//아이스아메리카노
//        Items item2 = itemService.selectItem(4);//밀크티
//
//        //주문
//        List<OrdersItem> ordersItemslist = new ArrayList<>();
//
//        OrdersItem ordersItem1 = OrdersItem.createOrdersItem(item1, 2);
//        OrdersItem ordersItem2 = OrdersItem.createOrdersItem(item2, 1);
//
//        ordersItemslist.add(ordersItem1);
//        ordersItemslist.add(ordersItem2);
//
//        Orders orders = new Orders(users, ordersItemslist);
//
//        ordersService.insertOrders(orders);
//
//        //포인트 적립
//    }











}
