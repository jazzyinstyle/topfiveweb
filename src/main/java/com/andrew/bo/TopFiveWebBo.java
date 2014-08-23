package com.andrew.bo;

import java.util.ArrayList;
import java.util.Date;

public interface TopFiveWebBo
{	 
	public ArrayList<String> getWebVisits(Date startDate, Date endDate);
}
