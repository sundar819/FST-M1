def add(*params):
    sum = 0
    for num in params:
        sum += num
    print(sum)
    
#input list
my_list = [1,2,3]
#function call
add(*my_list)