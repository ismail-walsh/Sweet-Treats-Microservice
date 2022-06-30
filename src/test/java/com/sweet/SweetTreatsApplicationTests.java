//package com.sweet;
//
//import com.sweet.entity.Application;
//import com.sweet.model.Order;
//import com.sweet.web.STController;
//import org.junit.Before;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//class SweetTreatsApplicationTests {
//
//	private MockMvc  mockMvc;
//
//	@InjectMocks
//	private STController stController;
//
//	@Before
//	public void setUp() throws  Exception{
//		mockMvc = MockMvcBuilders.standaloneSetup(stController)
//				.build();
//	}
//
//	//Checks if delivery distances return correct response
//	@Test
//	@DisplayName("Outside of Range")
//	public void OutsideOfRange(){
//		Order order = new Order(LocalTime.parse("09:00", DateTimeFormatter.ISO_TIME),  10, true);
//		Application.driverSelection(order);
//		Assertions.assertEquals(true , Application.outOfRange);
//	}
//
//	//Checks if delivery hours return correct response
//	@Test
//	@DisplayName("Outside of Hours")
//	public void OutsideOfHours(){
//		Order order = new Order(LocalTime.parse("22:00", DateTimeFormatter.ISO_TIME),  10, true);
//		Application.driverSelection(order);
//		Assertions.assertEquals(true, Application.noSelection);
//	}
//
//	//
//	@Test
//	public void cheapest(Order order) throws Exception {
////		mockMvc.perform(
////				MockMvcRequestBuilders.get("/Sweet-treats")
////		)
//
//
//	}
//}
