int small=0;
int greater=0;
int inversionCount=0;
for(int i=0;i<n-1;i++){
	for(int j=i+1;j<n;j++){
		if(arr[i>arr[j]]){
		small++;
		}
	}
	for(int j=i-1;j>0;j--){
		if(arr[i]<arr[j]){
			greater++;
		}
	}
}
return inversionCount+=small*greater;
