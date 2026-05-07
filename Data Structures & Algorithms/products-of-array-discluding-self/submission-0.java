class Solution {
    public int[] productExceptSelf(int[] nums) {
        int num= nums.length;
        int[] res = new int[num];

        res[0]=1;
// 2,4,5 normal
// 1,2,8 prefix
        for (int i=1; i<num; i++){
            res[i]=res[i-1]*nums[i-1];
        }
// 2,4,5 normal
//20,5,1 suffix
        int postfix=1;
        for (int i=num-1; i>=0; i--){
            res[i]=res[i]*postfix;
            postfix=postfix*nums[i];
        }

    return res;

    }
}  
