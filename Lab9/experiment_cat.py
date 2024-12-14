from cat import Cat
import random

# Class ExperimentCat implements experiment cat
class ExperimentCat(Cat):
    #Constructor
    def __init__(self, name="None", breed="None", number="None", name_master="None", info_collar=False, location="None"):
        super().__init__(name, breed, number, name_master, info_collar, location)
        self.poison = 0
        self.log_activity("ExperimentCat's name: "+self.name+", ExperimentCat's breed: "+self.breed.get_breed()+", Master's number: "+self.master.get_number()+", Master's name: "+self.master.get_name_master()+", ExperimentCat's collar: "+str(self.collar.get_presence()))

    # Method to put cat in the box
    def box(self):
        self.location = "Box"
        self.log_activity(self.name+" is in the "+self.location)

    # Method to put poison in the box
    def put_poison(self):
        self.poison = 1
        self.log_activity("Poison is in the Box")

    # Method to out poison in the box
    def out_poison(self):
        self.poison = 0
        self.log_activity("Poison is out of the Box")

    # Method to check status experiment
    def check_experiment(self):
        """

        """
        if self.poison == 1 and self.location == "Box":
            result = random.randint(0, 1)
            if result == 0:
                self.log_activity(self.name+" is dead in the experiment")
            else:
                self.log_activity(self.name+" is alive in the experiment")
        else:
            self.log_activity("Conditions for the experiment are not met")
