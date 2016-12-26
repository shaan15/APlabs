public class Road_accident{
	public static void main(String[] args){
		Vehicle v1 = new Harley_Davidson();
		Vehicle v2 = new Bullet();
		Vehicle v3 = new Cadillac();
		Vehicle v4 = new Ferrari();
		Vehicle v5 = new Ladybird();
		Vehicle v6 = new Firefox();
		// int arr[] new arr[6];
		// int i,j;
		// for(i=0;i<6;i++){
		// 	for(j=0;j<6;j++)
		// 		if(
		// i==j){
		// 			break;
		// 		}

		// }
		Vehicle [] array=new Vehicle[6];
		array[0]=v1;
		array[1]=v2;
		array[2]=v3;
		array[3]=v4;
		array[4]=v5;
		array[5]=v6;
		System.out.println(array[0].getOwnerName());

		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("      Model      |   Owner Name | Number of wheels |  Policy class  | Policy Expiry");
		System.out.println(" "+v1.getmodel()+" |    " + v1.getOwnerName() + "   |        " + v1.getWheels() + "         |  "+v1.getPolicyClass() + "  |  " + v1.getPol().getExpiryday()+"/"+v1.getPol().getExpirymonth()+"/"+v1.getPol().getExpiryyear());
		System.out.println("      "+v2.getmodel()+"     |     " + v2.getOwnerName() +"     |        " +v2.getWheels()+"         |  "+v2.getPolicyClass() + "|  " + v2.getPol().getExpiryday()+"/"+v2.getPol().getExpirymonth()+"/"+v2.getPol().getExpiryyear());
		System.out.println("     "+v3.getmodel()+"    |    " + v3.getOwnerName() +"     |        "+v3.getWheels()+"         |  "+v3.getPolicyClass() + "|  " + v3.getPol().getExpiryday()+"/"+v3.getPol().getExpirymonth()+"/"+v3.getPol().getExpiryyear());
		System.out.println("     "+v4.getmodel()+"     |    " + v4.getOwnerName() +"     |        " +v4.getWheels()+"         |  "+v4.getPolicyClass() + "|  " + v4.getPol().getExpiryday()+"/"+v4.getPol().getExpirymonth()+"/"+v4.getPol().getExpiryyear());
		System.out.println("    "+v5.getmodel()+"     |    " + v5.getOwnerName() +"     |        " +v5.getWheels()+"         |  "+v5.getPolicyClass() + "     |  " + v5.getPolicyClass());
		System.out.println("     "+v6.getmodel()+"     |   " + v6.getOwnerName() +"     |        " +v6.getWheels()+"         |  "+v6.getPolicyClass() + "     |  " + v6.getPolicyClass());
		System.out.println("------------------------------------------------------------------------------------");

	}
}