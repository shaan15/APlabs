public class Bullet extends Two_wheeler{
	
	Bullet()
	{super(new Policy());
		getPol().setExpiry_date_day(8);
		getPol().setExpiry_date_month(12);
		getPol().setExpiry_date_year(2017);
		getPol().setPolicy_number(1521);
		setOwnerName("John");
		setmodel("Bullet");
		setPolicyClass("Package policy");
		
	}
	int assignment2(long damage)
	{
		long day=getPol().getExpiryday();
		long month=getPol().getExpirymonth();
		long year=getPol().getExpiryyear();
		Package_policy pol2=new Package_policy();
		int check=pol2.Collision(damage,day,month,year);
		return check;

	}
	


}