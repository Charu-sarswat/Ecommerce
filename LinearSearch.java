public class LinearSearch{
    public static int linearSearch(int arr[],int key){
for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
        return i;
    }
}
    
    return -1;
}
public static void main(String args[]){
    int arr[]={2,5,3,6,1,8,5};
    System.out.println(linearSearch(arr,5));
}
}
