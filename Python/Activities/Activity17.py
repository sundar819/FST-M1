import pandas

data = {
  "UserNames": ["Admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "Almight"],

}

d1=pandas.DataFrame(data)
d1.to_csv("a2.csv",index=False)