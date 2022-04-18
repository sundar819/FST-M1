input_numbers = input('Enter elements of a list separated by space ')
print("\n")
user_tuple = input_numbers.split()
# print list
print('tuple: ', user_tuple)
for num in user_tuple:
     if int(num) % 5 == 0:
       
        
        print(num)