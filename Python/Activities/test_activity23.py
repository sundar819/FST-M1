import pytest
 
@pytest.fixture
def initialize_list():
    list=[0,1,2,3,4,5,6,7,8,9,10]
    return list

def sumoflistverify(initialize_list):
   sum=0
for i in initialize_list:
   sum+=i
assert sum==55