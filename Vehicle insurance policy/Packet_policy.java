public class Package_policy extends Policy
{	int Compare(int day,int month,int year)
	{	if(year==0)
			return 3;
		else if(year>2016)
			return 1;
		else if(year==2016)
		{
			if(month>08)
				return 1;
			else if(month==08)
			{	
				if(day>27)
					return 1;
				else if(day==27)
					return 1;
				else return 0;

			}
			else return 0;
		}	
		else return 0;
			
	}
	
	int Collision(int x,int day,int month,int year)
	{	
		if(Compare(day,month,year)==3)
			return 3;
		else if(Compare(day,month,year)==1)
		{
			return 2;//2 is for 80% damage paid by the policy(oncomming) and 50% on self
		}
		else return 0;//Exception

	}
}
