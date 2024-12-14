from breed import Breed
from master import Master
from collar import Collar

#Class Cat implements cat
class Cat:
    #Constructor
    def __init__(self, name="None", breed="None", number="None", name_master="None", info_collar=False, location="None"):
        self.name = name
        self.breed = Breed(breed)
        self.master = Master(number, name_master)
        self.collar = Collar(info_collar)
        self.energy = 5
        self.food = 5
        self.location = location
        self.log_activity(f"Cat's name: {self.name}, Cat's breed: {self.breed.get_breed()}, Cat's master: {self.master.get_number()}, {self.master.get_name_master()}, Cat's collar: {self.collar.get_presence()}")

    # Method gets name cat
    def get_name(self):
        return self.name

    # Method sets name cat
    def set_name(self, name):
        self.name = name
        self.log_activity(f"New name for cat's: {self.name}")

    # Method action play cat
    def play(self, game):
        if game == "mouse":
            self.energy -= 1
            self.food += 1
            self.log_activity(f"{self.name} plays with mouse: energy-1, food+1")
        elif game == "bug":
            self.energy += 1
            self.food -= 1
            self.location = "bugs"
            self.log_activity(f"{self.name} plays in bug: energy+1, food-1")
        else:
            self.energy -= 2
            self.food -= 1
            self.location = "outside"
            self.log_activity(f"{self.name} plays outside: energy-2, food-1")

    # Method action sleep cat
    def sleep(self):
        self.energy += 1
        self.log_activity(f"{self.name} sleeps: energy+1")

    # Method action clean cat
    def clean(self):
        self.energy -= 1
        self.log_activity(f"{self.name} cleans: energy-1")

    # Method to activate a night_vision cat's
    def night_vision(self, visor):
        self.energy -= 1
        self.log_activity(f"{self.name} night vision {visor}: energy-1")

    # Method to change location cat's
    def set_place(self):
        self.log_activity(f"{self.name} in {self.location}")

    # Method action eat cat
    def eat(self, food):
        if food == "fish":
            self.food += 1
            self.log_activity(f"{self.name} eats fish: food+1")
        elif food == "meat":
            self.food += 2
            self.log_activity(f"{self.name} eats meat: food+2")
        else:
            self.food -= 1
            self.log_activity(f"{self.name} doesn't want to eat candy: food-1")

    # Method to show status cat's
    def status(self):
        if self.energy == 5 and self.food == 5:
            self.log_activity("Status: Nice")
        elif self.energy < 5 or self.food < 5:
            self.log_activity(f"Status: {self.name} needs to sleep or eat")
        else:
            self.log_activity(f"Status: {self.name} wants to play")
        self.log_activity(f"Energy level: {self.energy}, Food level: {self.food}")

    # Method to show information about cat's
    def info_cat(self):
        self.log_activity(f"Cat's name: {self.name}, Cat's breed: {self.breed.get_breed()}, Master's number: {self.master.get_number()}, Master's name: {self.master.get_name_master()}, Cat's collar: {self.collar.get_presence()}, Cat's energy: {self.energy}")

    # Method to write action in file
    def log_activity(self, message):
        with open("cat_activity.log", "a") as f:
            f.write(message + "\n")
            print(message)