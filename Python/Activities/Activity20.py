import pandas

d3=pandas.read_excel("b1.xlsx",sheet_name="Sheet1")
print(d3.shape)
print(d3["Email"])
print(d3.sort_values("FirstName"))