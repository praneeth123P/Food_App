package com.food;

public class FoodItemsDTO 
{
     String food_id;
     String food_item_name;
     int price_per_qty;
     String food_description;
     String is_non_veg;
     String is_eggitarian;
     double avg_rating;
     String cuisine_id;
     String menu_id;
     
	public FoodItemsDTO(String food_id, String food_item_name, int price_per_qty, String food_description,
			String is_non_veg, String is_eggitarian, double avg_rating, String cuisine_id, String menu_id) 
	{
		super();
		this.food_id = food_id;
		this.food_item_name = food_item_name;
		this.price_per_qty = price_per_qty;
		this.food_description = food_description;
		this.is_non_veg = is_non_veg;
		this.is_eggitarian = is_eggitarian;
		this.avg_rating = avg_rating;
		this.cuisine_id = cuisine_id;
		this.menu_id = menu_id;
	}
	public String getFood_id() {
		return food_id;
	}
	public void setFood_id(String food_id) {
		this.food_id = food_id;
	}
	public String getFood_item_name() {
		return food_item_name;
	}
	public void setFood_item_name(String food_item_name) {
		this.food_item_name = food_item_name;
	}
	public int getPrice_per_qty() {
		return price_per_qty;
	}
	public void setPrice_per_qty(int price_per_qty) {
		this.price_per_qty = price_per_qty;
	}
	public String getFood_description() {
		return food_description;
	}
	public void setFood_description(String food_description) {
		this.food_description = food_description;
	}
	public String getIs_non_veg() {
		return is_non_veg;
	}
	public void setIs_non_veg(String is_non_veg) {
		this.is_non_veg = is_non_veg;
	}
	public String getIs_eggitarian() {
		return is_eggitarian;
	}
	public void setIs_eggitarian(String is_eggitarian) {
		this.is_eggitarian = is_eggitarian;
	}
	public double getAvg_rating() {
		return avg_rating;
	}
	public void setAvg_rating(double avg_rating) {
		this.avg_rating = avg_rating;
	}
	public String getCuisine_id() {
		return cuisine_id;
	}
	public void setCuisine_id(String cuisine_id) {
		this.cuisine_id = cuisine_id;
	}
	public String getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	@Override
	public String toString() {
		return "FoodItemsDTO [food_id=" + food_id + ", food_item_name=" + food_item_name + ", price_per_qty="
				+ price_per_qty + ", food_description=" + food_description + ", is_non_veg=" + is_non_veg
				+ ", is_eggitarian=" + is_eggitarian + ", avg_rating=" + avg_rating + ", cuisine_id=" + cuisine_id
				+ ", menu_id=" + menu_id + "]";
	}
	

     
	
     
}
