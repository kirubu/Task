package com.wipro.hms.service;



import com.wipro.hms.bean.RentalPropertyBean;
import com.wipro.hms.dao.RentalPropertyDAO;
import com.wipro.hms.util.InvalidCityException;

public class RentalPropertyService {

	public static void main(String[] args) 
	{
		RentalPropertyBean bean = new RentalPropertyBean();
		bean.setCity("Chennai");
		bean.setLocation("Velachery");
		bean.setNoOfBedRooms(2);
		bean.setRentalAmount(15000);
		RentalPropertyService service = new RentalPropertyService();
		System.out.println(service.addRentalProperty(bean));
	}

	public String addRentalProperty(RentalPropertyBean bean) 
	{
		String status = "";
		if (bean.getCity() == null || bean.getLocation() == null)
			return "NULL VALUES IN INPUT";
		if (bean.getCity().length() == 0 || bean.getLocation().length() == 0 || bean.getNoOfBedRooms() == 0 || bean.getRentalAmount() == 0)
			return "INVALID INPUT";
		
		  try 
		  { 
			  if(bean.getCity().toLowerCase().equals("chennai") || bean.getCity().toLowerCase().equals("bengaluru")) 
			  { 
				  	RentalPropertyDAO dao = new RentalPropertyDAO();
					int res = dao.createRentalProperty(bean);
					if (res > 0)
						status = "SUCCESS";
					else
						status = "FAILURE";
			  }
			  else
			  {
				  throw new InvalidCityException(); 
			  }
		  
		  } 
		  catch (InvalidCityException e) 
		  { 
			  return "INVALID CITY"; 
		  }
		
		
		return status;
	}

	public void validateCity(String city) throws InvalidCityException 
	{
		try 
		  { 
			  if(city.toLowerCase().equals("chennai") || city.toLowerCase().equals("bengaluru")) 
			  { 
				   
			  }
			  else
				  throw new InvalidCityException();
		  
		  } 
		  catch (InvalidCityException e) 
		  { 
			  //System.out.println(e); 
		  }
	}
}
