package com.ttaf.PageObject;

import com.ttaf.Library.AppLibrary;

public class importPage {
	AppLibrary appLibrary;
	
	 public static String btnImport="id:btnImport";
	 public static String UploadFolderFiles="id:UploadFolderFiles";
	 public static String ProjectMenu="id:ProjectMenu";
	 public static String collName="xpath://a[text()='CollectionForTesting']";
	 

	public importPage(AppLibrary appLibrary) {
		this.appLibrary = appLibrary;
	}

	public ExposedUrlPage importColl() throws Exception 
	{
		appLibrary.clickElement(btnImport);
		
		appLibrary.findElement(UploadFolderFiles).sendKeys("/Users/Apple/Documents/APIStrong/ttaf-main/TestData/CollectionForTesting.postman_collection.json");
		
		return new ExposedUrlPage(appLibrary);
		
	}
	public ExposedUrlPage verification() throws Exception 
	{
		appLibrary.clickElement(ProjectMenu);
		try
		{
		appLibrary.findElement(collName);
		System.out.println("Collection is imported");

		}
		catch(Exception e)
		{
			System.out.println("Collection is not imported");
		}


		return new ExposedUrlPage(appLibrary);
		
	}

	
}
