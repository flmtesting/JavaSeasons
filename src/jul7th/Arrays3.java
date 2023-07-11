package jul7th;

public class Arrays3 {

	public static void main(String[] args) {
		
		// username password   expectedTitle
		
		//reyaz0607 reyaz123 Adactin.com - Search Hotel
		//reyaz0607 reyaz456 Adactin.com - Hotel Reservation System
		//reyaz1212 reyaz123  Adactin.com - Hotel Reservation System
		//reyaz1212 reyaz456  Adactin.com - Hotel Reservation System
		
		String[][] data=new String[4][3];
		
		data[0][0]="reyaz0607";
		data[0][1]="reyaz123";
		data[0][2]="Adactin.com - Search Hotel";
		
		data[1][0]="reyaz0607";
		data[1][1]="reyaz456";
		data[1][2]="Adactin.com - Hotel Reservation System";
		
		data[2][0]="reyaz1212";
		data[2][1]="reyaz123";
		data[2][2]="Adactin.com - Hotel Reservation System";
		
		data[3][0]="reyaz1212";
		data[3][1]="reyaz456";
		data[3][2]="Adactin.com - Hotel Reservation System";
		
		System.out.println(data.length);
		
		System.out.println(data[0].length);
		System.out.println(data[1].length);
		System.out.println(data[2].length);
		System.out.println(data[3].length);
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"\t\t");
			}
			System.out.println();
		}
		

	}

}
