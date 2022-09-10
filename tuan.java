void numberOneTriangle(int n){
     for(int i=0; i<n; j++){
        for(int j=0; j<i+1; j++){
            printf("1");
         }
           printf("\n");
    }
}
int main(){
    int n;
    printf("input n: ");
    scanf("%d" ,&n);
     numberOneTriangle(n)   
}