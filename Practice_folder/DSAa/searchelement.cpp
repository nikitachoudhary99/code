class Solution {
    public:
        int singleNonDuplicate(vector<int>& nums) {
           int  size=nums.size();
           if(size==nums.size())
           {
            return nums[0];
           }
           if(nums[0]!=nums[1])
           {
            return nums[0];
           }
           if(nums[size-1]!=nums[size-2])
           {
            return nums[size-1];
           }
            s=1;
            e=size-2;
          while(s<=e)
          {
            int mid=s+(e-s)/2;
            if(nums[mid]!=mid%2==0 && nums[mid]!=nums[mid+1])
            {
                return nums[mid];
            }
            else if(mid%2==0 && nums[mid]==nums[mid+1] || mid%2==1 && nums[mid]==nums[mid-1])
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
          }
           
        }
    };