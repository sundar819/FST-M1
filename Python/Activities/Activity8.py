input_string = input('Enter elements of a list separated by space ')
print("\n")
user_list = input_string.split()
# print list
print('list: ', user_list)
# convert each item to int type
#for i in range(len(user_list)):
    # convert each item to int type
    #user_list[i] = int(user_list[i])
if user_list[0]==user_list[len(user_list)-1]:
      print(True)
else:
      print(False)