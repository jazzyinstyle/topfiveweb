package com.andrew.ws;
import java.util.ArrayList;
import java.util.Date;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.andrew.bo.TopFiveWebBo;

@WebService
public class TopFiveWebWs
{	
	// DI via Spring
	TopFiveWebBo topFiveWebBo;

	@WebMethod(exclude = true)
	public void setTopFiveWebBo(TopFiveWebBo topFiveWebBo)
	{
		this.topFiveWebBo = topFiveWebBo;
	}
	
	@WebMethod(operationName = "getWebVisits")
	public ArrayList<String> getWebVisits(Date startDate, Date endDate)
	{
		return topFiveWebBo.getWebVisits(startDate, endDate);
	}
}
