package day1;

public class InverseCaptcha {

	public static void main(String[] args) {
		String s="91212129";
		
		String[] s1=s.split("");

int[] r = new int[s1.length];

for (int i = 0; i < s1.length; i++) {
    try {
        r[i] = Integer.parseInt(s1[i]);
        //System.out.println(r[i]);
    } catch (NumberFormatException nfe) {
        
    };
}

		int n=r.length;
		
		int[] b=new int[n*2];
		for (int i = 0; i < n; i++) {
			b[i]=b[n+i]=r[i];
		}
		
		int num=0;
		for (int i = 0; i <b.length/2; i++) {
			if(b[i]==b[i+1]) {
				System.out.println(b[i]);
				num=num+b[i];
			}
			
		}
		System.out.println(num);
		
	
	}

}
