class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int res1=-1;
        int res2=-1;
        int resc1=0;
        int resc2=0;
        ArrayList<Integer> res= new ArrayList<>();

    for (int i=0; i<nums.length; i++){
       if(res1==nums[i]){
        resc1++;
       }else if ( res2 == nums[i]){
        resc2++;
       }else if ( resc1==0 ){
        resc1=1;
        res1 = nums[i];
       }else if (resc2==0){
        resc2=1;
        res2= nums[i];
       }else{
        resc1--;
        resc2--;
       }
    }

    resc2 = resc1= 0;
    for (int num: nums){
        if(num==res1){resc1++;}else if (res2==num){resc2++;}
    }
    if(resc1 > nums.length/3){
        res.add(res1);
    }
    if(resc2 > nums.length/3){
        res.add(res2);
    }
    return res;
    }
}