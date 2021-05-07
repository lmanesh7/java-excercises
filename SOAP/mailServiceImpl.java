package com.soap.net;

import java.util.ArrayList;
import java.util.List;



public class mailServiceImpl {

private static List<EmailInfo> mailCatalog;

	public EmailInfo searchById(String id) throws Exception
	{
		for(EmailInfo e : mailCatalog) if(e.getEmailid()==id) return e;
		throw new Exception("No product found with id " + id);
	}
	public EmailInfo[] getAllEmailInfos()
	{
		EmailInfo[] emails = new EmailInfo[mailCatalog.size()];
		int i=0;
		for(EmailInfo e : mailCatalog) {
			emails[i] = e;
			i++;
		}
		return emails;
	}
	public void insertProduct(EmailInfo emailinfo) {
		mailCatalog.add(emailinfo);
	}
	public void initializeProductCatalog() {
        if (mailCatalog ==null) {
            mailCatalog= new ArrayList<EmailInfo>();
            mailCatalog.add(new EmailInfo("manesh" ,"manesh@gmail.com " ,2014054841));
            mailCatalog.add(new EmailInfo("mouse" ,"mouse234@gmail.com", 1958500458));
}
	}
	public mailServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		initializeProductCatalog();
	}
}



