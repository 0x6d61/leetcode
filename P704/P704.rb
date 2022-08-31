# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}
def search(nums, target)
   result = nums.index(target)
   result != nil ? result : -1
end

pp search([-1,0,3,5,9,12],9)
pp search([-1,0,3,5,9,12],2)