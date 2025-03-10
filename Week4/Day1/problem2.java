// 2. Subsets 2 

// Given an integer array nums that may contain duplicates, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

//Solution:

class problem2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(),nums, 0);
        return list;
    }
    public void backtrack(List<List<Integer>> list,List<Integer> tempList,int[] nums,int start){
        list.add(new ArrayList<>(tempList));
        for(int i =start;i< nums.length;i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,i+1);
            tempList.remove(tempList.size() - 1);
        }
    }
}