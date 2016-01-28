class GskAssignment2_3{
public static void main(String[] args){
int i=1;
int j=1;
String op="";
while(j<=5){
	while(i<=j){
	
		op=op+i;
		i++;
	}
	System.out.println(op);
	j++;
	}
op="";	
j--;
while(j>0){
	i=1;
	while(i<j){
		
		op=op+i;
		i++;
	}
	System.out.println(op);
	op="";
	j--;
}

}}
