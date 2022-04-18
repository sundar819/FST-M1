class Car:
   

    def __init__(self,Manufacturer,Model,make,transmission,color):
        self.Manufacturer=Manufacturer
        self.Model=Model
        self.make=make
        self.transmission=transmission
        self.color=color

    def accelerate(self):
        print (self.Manufacturer + " "+ self.Model +" "+ "is moving")
    
    def stop(self):
        print(self.Manufacturer + " "+ self.Model +" "+ "has stopped") 

car1=Car("Ford","Mustang","2015","Manual","Red")
car2=Car("Maruthi","Omni","2019","Automatic","Green")
car1.accelerate()
car1.stop()
       

        