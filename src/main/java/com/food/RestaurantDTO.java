package com.food;

public class RestaurantDTO 
{
	int res_id;
	String res_name;
	String address;
	String location;
	String open_time;
	String close_time;
	int gst_number;
	String cuisines_list;
	double contact_num;
	double bank_account_num;
	String email;
	String login_password;
	double avg_rating;
	String curr_order_accepting_status;
	String Image;
        String image;

	public RestaurantDTO(int res_id, String res_name, String address, String location, String open_time,
			String close_time, int gst_number, String cuisines_list, double contact_num, double bank_account_num,
			String email, String login_password, double avg_rating, String curr_order_accepting_status, String image) 
	{
		super();
		this.res_id = res_id;
		this.res_name = res_name;
		this.address = address;
		this.location = location;
		this.open_time = open_time;
		this.close_time = close_time;
		this.gst_number = gst_number;
		this.cuisines_list = cuisines_list;
		this.contact_num = contact_num;
		this.bank_account_num = bank_account_num;
		this.email = email;
		this.login_password = login_password;
		this.avg_rating = avg_rating;
		this.curr_order_accepting_status = curr_order_accepting_status;
		this.image = image;
		
	}

	public int getRes_id() {
		return res_id;
	}

	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}

	public String getRes_name() {
		return res_name;
	}

	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOpen_time() {
		return open_time;
	}

	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}

	public String getClose_time() {
		return close_time;
	}

	public void setClose_time(String close_time) {
		this.close_time = close_time;
	}

	public int getGst_number() {
		return gst_number;
	}

	public void setGst_number(int gst_number) {
		this.gst_number = gst_number;
	}

	public String getCuisines_list() {
		return cuisines_list;
	}

	public void setCuisines_list(String cuisines_list) {
		this.cuisines_list = cuisines_list;
	}

	public double getContact_num() {
		return contact_num;
	}

	public void setContact_num(double contact_num) {
		this.contact_num = contact_num;
	}

	public double getBank_account_num() {
		return bank_account_num;
	}

	public void setBank_account_num(double bank_account_num) {
		this.bank_account_num = bank_account_num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin_password() {
		return login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}

	public double getAvg_rating() {
		return avg_rating;
	}

	public void setAvg_rating(double avg_rating) {
		this.avg_rating = avg_rating;
	}

	public String getCurr_order_accepting_status() {
		return curr_order_accepting_status;
	}

	public void setCurr_order_accepting_status(String curr_order_accepting_status) {
		this.curr_order_accepting_status = curr_order_accepting_status;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "RestaurantDTO [res_id=" + res_id + ", res_name=" + res_name + ", address=" + address + ", location="
				+ location + ", open_time=" + open_time + ", close_time=" + close_time + ", gst_number=" + gst_number
				+ ", cuisines_list=" + cuisines_list + ", contact_num=" + contact_num + ", bank_account_num="
				+ bank_account_num + ", email=" + email + ", login_password=" + login_password + ", avg_rating="
				+ avg_rating + ", curr_order_accepting_status=" + curr_order_accepting_status + ", image=" + image
				+ "]";
	}
	
	
}
