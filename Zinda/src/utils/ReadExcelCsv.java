package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import au.com.bytecode.opencsv.CSVReader;


public class ReadExcelCsv 


{

	//private String firstName;


	public String getUserName()

	{
		return userName;
	}

	public void setUserName(String userName) 

	{
		this.userName = userName;
	}

	public String getPassword()

	{
		return password;
	}

	public void setPassword(String password) 

	{
		this.password = password;
	}


	private String userName;
	private String password;

	public String getOrguserName() {
		return orguserName;
	}

	public void setOrguserName(String orguserName) {
		this.orguserName = orguserName;
	}

	public String getOrgPassword() {
		return orgPassword;
	}

	public void setOrgPassword(String orgPassword) {
		this.orgPassword = orgPassword;
	}


	private String orguserName;
	private String orgPassword;


	@DataProvider(name = "regCSVData")

	public static Object[][] getCSVData() throws IOException 

	{

		CSVReader csvReader = new CSVReader(new FileReader(("D:\\LESmith.csv")));


		List<String[]> dataList = csvReader.readAll();
		Object[][] data = new Object[dataList.size()][1];
		List<ReadExcelCsv> regList = new ArrayList<ReadExcelCsv>();

		for (String[] strArray : dataList)

		{
			ReadExcelCsv csv = new ReadExcelCsv();

			csv.setUserName(strArray[0].trim());
			csv.setPassword(strArray[1].trim());
			csv.setOrguserName(strArray[2].trim());
			csv.setOrgPassword(strArray[3].trim());

			regList.add(csv);
		}

		for (int i = 0; i < data.length; i++) 

		{
			for (int j = 0; j < data[i].length; j++) 

			{
				data[i][j] = regList.get(i);
			}
		}

		csvReader.close();
		return data;
	}
}
