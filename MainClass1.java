import java.util.*;
import java.time.LocalTime;
class UrlData
{	
	int c;
	String url;
	String uniq;
	UrlData()
	{
	url=" ";
	uniq=" ";
	c=0;
	}
	UrlData(String ur,String un,int c1)
	{
	url=ur;
	uniq=un;
	c=c1;
	}
	void display()
	{
		System.out.println("\n\tURL : "+url);
		System.out.println("\n\tUNIQUE ID : "+uniq);
		System.out.println("\n\tCOUNT : "+c);
	}
}
class MainClass1
{
	public static void main(String args[])
	{
		/*ArrayList <String> ar=new ArrayList <String>();
		ArrayList <String> ar2=new ArrayList <String>();
		ArrayList <String> ar3=new ArrayList <String>();*/
		try{
		UrlData urls[] = new UrlData[5];
       		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the command : ");
		//String s=sc.nextLine();
		//String[] splited = s.split("\\s+");
		String[] splited = new String[2];		
		do
		{
		splited=sc.nextLine().split("\\s+");
		switch(splited[0])
			{
				case "storeurl"://ar.add(splited[1]);
						LocalTime time = LocalTime.now();
						String uniq=splited[1]+time;
						urls[a]=new UrlData(splited[1],uniq,0);
						a++;
						System.out.println(uniq);
						//ar2.add(uniq);
						System.out.println("\n\t........Stored Succesfully.............");
						break;
				case "get":	for(int i=0;i<a;i++)
						{
						if((urls[i].url).equals(splited[1]))
						{
							urls[i].c++;
							System.out.println("Unique Id ="+urls[i].uniq);
						}
						}
						System.out.println("\n\t.....................");
						break;
				case "count":for(int i=0;i<a;i++)
						{
						if((urls[i].url).equals(splited[1]))
						{
							System.out.println("Unique Id ="+urls[i].uniq);
							System.out.println("URL ="+urls[i]);
							System.out.println("Count ="+urls[i].c);
						}
						}break;
				case "list":try{/*if(ar.size()>0)
						{
							System.out.println("\n\tURLS ARE ---- ");
							for(String i:ar)
							{
							System.out.println(i);
							}
						}
						else{
							System.out.print("\n\tNo URLS !!!");
						}*/
						for(UrlData i:urls)
						{
							i.display();
							System.out.println("\n\t.....................");
						}
					}
					catch (NullPointerException e){}
					break;
				case "exit":break;
				default:System.out.println("------Please enter a valid choice------");break;
			}
		}while(!splited[0].equals("exit"));
		}
		catch (ArrayIndexOutOfBoundsException e){}
	}
}