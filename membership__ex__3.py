# Base Class
class Member:
    def __init__(self, name, membershipID):
        self.name = name
        self.membershipID = membershipID

    def display(self):
        print("Name:", self.name)
        print("Membership ID:", self.membershipID)


# Derived Class
class Regular(Member):
    def __init__(self, name, membershipID):
        super().__init__(name, membershipID)

    def display(self):
        print("Membership Type: Regular")
        super().display()


class Premium(Member):
    def __init__(self, name, membershipID):
        super().__init__(name, membershipID)

    def display(self):
        print("Membership Type: Premium")
        super().display()


r1 = Regular("Anusya", 101)
p1 = Premium("Anu", 201)

print("----- Regular Member -----")
r1.display()

print("\n----- Premium Member -----")
p1.display()
