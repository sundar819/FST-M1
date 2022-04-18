from audioop import add


example_list1=[1,3,4,5,8,10,12,14,7,9]
example_list2=[20,21,22,23,24,25,26]

example_list3=[]
for num in example_list1:
    if(num % 2!=0):
        example_list3.append(num)

for num in example_list2:
    if(num % 2==0):
        example_list3.append(num)

print(example_list3)