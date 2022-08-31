# @param {Integer[]} arr
# @param {Integer[][]} pieces
# @return {Boolean}
def can_form_array(arr, pieces)
    index = 0
    result = []
    while index < arr.length
        search_num = arr[index]
        nums = pieces.filter{|n|n[0] == search_num}
        if nums.length != 0
            result.push(nums[0])
            index+=nums[0].length
        else
            return false
        end
    end
    result.flatten == arr ? true : false
end

pp can_form_array([15,88],[[88],[15]])
pp can_form_array([49,18,16],[[16,18,49]])
pp can_form_array([91,4,64,78],[[78],[4,64],[91]])