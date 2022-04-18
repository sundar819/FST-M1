
from ast import Continue
from tkinter import Y

while True:
   user1_input = input("enter user1 input")
   user2_input=input("enter user2 input")

   if user1_input==user2_input:
    print("Match tied and no one wins")
   elif user1_input=='rock':
    if user2_input=='scissors':
        print("rock wins")
    else:
        print("paper wins")

   elif user1_input=='paper':
    if user2_input=='rock':
        print("paper wins")
    else:
        print("scissors wins")

   elif user1_input=='scissors':
    if user2_input=='paper':
        print("scissors wins")
    else:
        print("rock wins")
else:
    print("entered input is other than rock or paper or scissors-please enter any one of them")


userinput=input("Play again: y/n")

if userinput=="n":
    raise SystemExit
elif userinput!="y":
        print ("invalid input")
elif userinput!="n":
        print ("invalid input")
else:
     pass