
class Prime{

public static void main(String args[]){

int n=525;
int count=0;

for(int i=1;i<=n;i++){
  
int j=2;
while(j<i){
if(i%j==0){
break;
}

j=j+1;
}

if(j>i-1){
System.out.println("Prime No. "+i);
count=count+1;
}

}

System.out.println("Total Count: "+count);
}
}
