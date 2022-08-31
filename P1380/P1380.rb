# @param {Integer[][]} matrix
# @return {Integer[]}
def lucky_numbers (matrix)
    result = []
    matrix.each_with_index do |m,index|
        min_num = m.min
        column_index = matrix[index].index(min_num)
        if matrix.map{|m|m[column_index]}.max == min_num
            result.push(min_num)
        end 
    end
    return result
end

pp lucky_numbers([[3,7,8],[9,11,13],[15,16,17]])
pp lucky_numbers([[1,10,4,2],[9,3,8,7],[15,16,17,12]])
pp lucky_numbers([[7,8],[1,2]])