package a;
//second maximum number
public class A {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int l=arr[0];
		int sl=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>l) {
				sl=l;
				l=arr[i];
			}else if (arr[i]>sl) {
				sl=arr[i];
			}
		}
		System.out.println(sl);
		
		
	}

}
