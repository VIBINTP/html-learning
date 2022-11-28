public class grade{
public static void main(String[] args){
int s1=50,s2=60,s3=70,s4=80,s5=89;
int avg=(s1+s2+s3+s4+s5)/5;
if(avg<50)
{
    System.out.println("student is failed");
}
else if(avg>=50&&avg<60){
System.out.println("grade= A");
}
else if(avg>=60&&avg<70){
    System.out.println("grade =B");
}
else if(avg>=70&&avg<80){
    System.out.println("grade= C");
}
else if(avg>=80&&avg<100){
    System.out.println("grade S");
}



}

}






