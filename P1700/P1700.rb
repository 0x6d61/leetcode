# @param {Integer[]} students
# @param {Integer[]} sandwiches
# @return {Integer}
def count_students(students, sandwiches)
    while true
        if students.length == 0
            return 0
        end

        if students.uniq.count == 1 && students[0] != sandwiches[0]
            return students.length
        end

        student = students.first
        sandwiche = sandwiches.first
        if student == sandwiche
            sandwiches = sandwiches.drop(1)
            students = students.drop(1)
        else
            students =  students.drop(1)
            students.push(student)
        end
    end
end

pp count_students([1,1,0,0],[0,1,0,1])
pp count_students([1,1,1,0,0,1],[1,0,0,0,1,1])

