package com.company.spring.controller.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.company.spring.entity.Product; 
import com.company.spring.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;


	@RequestMapping("/product")
	public ModelAndView listEmployee(ModelAndView model)  {
    
	  
	  
	  List<Product> listProduct = productService.findAll();

	    model.addObject("list", listProduct);
	  model.setViewName("client/product");
    return model;
  }

}
