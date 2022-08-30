# @param {Integer[]} nums
# @return {Integer}
def find_closest_number(nums)
    result = nums.max
    nums.each do |n|
        if n.abs < result.abs || (result.abs == n.abs && n >= result)
            result = n
        end
    end
    result
end

pp find_closest_number([-4,-2,1,4,8])
pp find_closest_number([2,-1,1])