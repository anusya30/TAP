import math
class shape:
  def __init__(self,length=0,width=0):
    self.length=length
    self.width=width
  def get_area (self):
    return 0
  def display(self):
    print(f"shape with length = {self.length}, width= {self.width}")


class rectangle(shape):
  def __init__ (self,length,width):
    super().__init__(length,width)
  def get_area(self):
    return self.length*self.width
  def display(self):
    print(f"Rectangle: Area = {self.get_area()}")


class circle(shape):
  def __init__ (self,radius):
    super().__init__(radius,0)
    self.radius=radius
  def get_area(self):
    return math.pi*self.radius*self.radius
  def diplay(self):
    print(f"Circle : Radius ={self.radius}, Area = {get_area()}")
def main():
  rect = rectangle(5,4)
  circ = circle(3)
  rect.display()
  circ.display()
  print("Rectangle:",rect.get_area())
  shapes=[rectangle(5,4),circle(3)]

if __name__ == "__main__":
  main()
