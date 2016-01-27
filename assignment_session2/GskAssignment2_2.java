class GskAssignment2_2{
public static void main(String[] args){
	int v1=1,v2=100;
	System.out.println("Prime Numbers between "+v1+" and "+v2);
	for(int i=v1;i<=v2;i++){
		int cnt=0;
		if(i%2!=0){cnt++;}
		if(i%3!=0){cnt++;}
		if(i%5!=0){cnt++;}
		if(i%6!=0){cnt++;}
		if(i%7!=0){cnt++;}
		if((i==2)||(i==3)||(i==5)){cnt++;}
		if(cnt>4){
			System.out.println(i);
		}
	}
}}