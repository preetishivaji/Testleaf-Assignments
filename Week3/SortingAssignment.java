package week3.day2;
import java.util.*;

public class SortingAssignment {

	public static void main(String[] args) {
		String[] cmp = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> company = new ArrayList<String>();
		List<String> company1 = new ArrayList<String>();
		
		for (int i=0;i<cmp.length;i++)
		{
			company.add(cmp[i]);
		}
		
		Collections.sort(company);
		System.out.println(company);

		for (int j=company.size()-1;j>=0;j--)
		{
			company1.add(company.get(j));
		}
		System.out.println("Sorting - "+company1);
		
	}

}
