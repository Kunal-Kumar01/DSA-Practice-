class ReverseString541 {
    public static String reverseStr(String s, int k) {

        if(s.length()==1) return s;
        char[] chars = s.toCharArray();

        int left = 0;
        int right = 0;
        char temp = ' ';
        
            for(int i = 0; i<s.length(); i=(i+2*k)){
                System.out.println(i);
                left=i;
                right=i+k-1;
                right = Math.min(i + k - 1, s.length() - 1);
                while((left<right)){
                    temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
            }
        
       

        String result = new String(chars);
        return result;

    }

    public static void main(String[] args){

        String s = "fdnbdkshgbvsdkvdsv";
        System.out.println(reverseStr(s, 5));

    }
}