
#num=int(input("enter no"))
#for i in range(num+1):
    #print(i)
    
#my_list=[0,1,2,3,4,5,6,7,8,9,10]

#length = len(my_list)

#sum=0
#for i in range(length):
    
  #sum = sum + my_list[i]

#print(sum)

def sumoffirsttennumbers(endingno):
  
 My_list = []
 startingno=0
 endingno=int(input("enter ending no"))
 My_list.extend(range(startingno, endingno+1))
 #print(My_list)
 length = len(My_list)
 sum=0
 for i in range(length):
  sum = sum + My_list[i]
 print("sum of first {} numbers:".format(endingno),sum)

sumoffirsttennumbers(10)


