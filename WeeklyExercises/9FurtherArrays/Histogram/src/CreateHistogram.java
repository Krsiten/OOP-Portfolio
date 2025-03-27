
public class CreateHistogram
{
	private int[] histoData;
	private int[] histogram = new int[10];
	
	public CreateHistogram(int... num)
	{
		histoData = num;
	}
	
	public void formatData()
	{
		for (int m : histoData)
		{
			if (m > 0 && m <= 10)
			{
				histogram[0] += 1;
			} if (m > 10 && m <= 20)
			{
				histogram[1] += 1;
			} if (m > 20 && m <= 30)
			{
				histogram[2] += 1;
			} if (m > 30 && m <= 40)
			{
				histogram[3] += 1;
			} if (m > 40 && m <= 50)
			{
				histogram[4] += 1;
			} if (m > 50 && m <= 60)
			{
				histogram[5] += 1;
			} if (m > 60 && m <= 70)
			{
				histogram[6] += 1;
			} if (m > 70 && m <= 80)
			{
				histogram[7] += 1;
			} if (m > 80 && m <=90)
			{
				histogram[8] += 1;
			} if (m > 90 && m <= 100)
			{
				histogram[9] += 1;
			} else
			{
				continue;
			}
		}
	}
		
	public String toString()
	{
		formatData();
		
		return String.format("""
				---Histogram---
				1-10  : %s
				11-20 : %s
				21-30 : %s
				31-40 : %s
				41-50 : %s
				51-60 : %s
				61-70 : %s
				71-80 : %s
				81-90 : %s
				91-100: %s
				""", 	"*".repeat(histogram[0]), "*".repeat(histogram[1]), "*".repeat(histogram[2]), "*".repeat(histogram[3]),
						"*".repeat(histogram[4]), "*".repeat(histogram[5]), "*".repeat(histogram[6]), "*".repeat(histogram[7]),
						"*".repeat(histogram[8]), "*".repeat(histogram[9]));
	}
}
 