class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        int p1 = 0;
        int p2 = 0;
        for(int i = 0; i<m; i++){
            temp[i] = nums1[i];
        }


        for(int i = 0; i<nums1.length; i++){
            if( (p1<m) && ( p2>=n || temp[p1]<nums2[p2])){
                nums1[i] = temp[p1];
                p1++;
            }
            else{
                nums1[i] = nums2[p2];
                p2++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        solution.merge(nums1, 3, nums2, 3);
        System.out.println("Merged array: ");
        for(int i = 0; i<nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }
    }
}