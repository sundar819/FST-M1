import pandas as pd

d2=pd.read_csv('a2.csv')

print(d2["UserNames"])
print(d2["UserNames"][1],d2["Passwords"][1])
print(d2.sort_values("UserNames"))
print(d2.sort_values("Passwords",ascending=False))

