package net.fpt.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.fpt.shoppingbackend.dao.CategoryDAO;
import net.fpt.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
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
		categories.add(category);

		// Second category
		category = new Category();
		category.setId(2);
		category.setName("Moblie");
		category.setDescription("This is some description moblie!");
		category.setImageURL("Cat_2.png");
		categories.add(category);

		// Third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description Laptop!");
		category.setImageURL("Cat_3.png");
		categories.add(category);
		// Third category
		category = new Category();
		category.setId(4);
		category.setName("Media");
		category.setDescription("This is some description Laptop!");
		category.setImageURL("Cat_3.png");
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
