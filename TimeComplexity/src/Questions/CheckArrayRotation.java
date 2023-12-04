package Questions;

public class CheckArrayRotation {

    public static int arrayRotateCheck(int[] arr){
        int index=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                index=i;
                }
        }
        return index;
    }
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,2};
		int ans=arrayRotateCheck(arr);
		System.out.println(ans);

	}

}
