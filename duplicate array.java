class Solution {
    public boolean containsDuplicate(int[] nums) {
        // method 1
        // for(int i = 0; i < nums.length; i++){

        //     for(int j = i + 1; j < nums.length; j++){

        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        

        // method 2 .. hashing se
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i] , i);
            }
        }
        return false;

    }
}
