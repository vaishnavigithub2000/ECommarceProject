package com.javaguides.springboot.global;

import java.util.ArrayList;
import java.util.List;

import com.javaguides.springboot.modal.Product;

public class GlobalData {
public static List<Product> cart;
static {
	cart =new ArrayList<Product>();
}
}
