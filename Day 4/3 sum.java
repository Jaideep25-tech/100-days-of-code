class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triples = new ArrayList<>();
        //for unique tripletes
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {

            int l = i + 1;
            int r = nums.length - 1;

            while(l < r) {
                if(nums[i] + nums[l] + nums[r] == 0) {
                    List<Integer> new_triplet = new ArrayList<>();
                    new_triplet.add(nums[i]);
                    new_triplet.add(nums[l]);
                    new_triplet.add(nums[r]);
                    Collections.sort(new_triplet);
                    if(!set.contains(new_triplet)) {
                        triples.add(new_triplet);
                        set.add(new_triplet);
                    }
                   
                }
                if(nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                }
                else
                    r--;
            }

        }

        return triples;
    }
}
