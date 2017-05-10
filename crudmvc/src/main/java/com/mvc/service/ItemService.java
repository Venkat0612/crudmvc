package com.mvc.service;

import java.io.IOException;
import java.util.List;

import com.mvc.model.Item;

public interface ItemService {


	  public boolean addItem(Item item) throws IOException;  
	    public Item getItem(int id);
	    public void deleteItem(int id);
	    public List<Item> getAllItems();
	 
	
}