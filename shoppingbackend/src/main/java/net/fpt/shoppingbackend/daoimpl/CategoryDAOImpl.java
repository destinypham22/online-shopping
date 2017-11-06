package net.fpt.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.fpt.shoppingbackend.dao.CategoryDAO;
import net.fpt.shoppingbackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {

	
	public static List<Category> categores = new ArrayList<>();
	static {
		Category category = new Category();
		/*
		 * add first category
		 * 
		 */
		category.setId(1);
		category.setName("Televison");
		category.setDescription("This is some description televison!");
		category.setImageURL("Cat_1.png");
		categores.add(category);
		
		//Second category
		category.setId(2);
		category.setName("Moblie");
		category.setDescription("This is some description moblie!");
		category.setImageURL("Cat_2.png");
		categores.add(category);
		
		//Third category
			
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description Laptop!");
		category.setImageURL("Cat_3.png");
		categores.add(category);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categores;
	}

}
