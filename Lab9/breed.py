#Class Breed implements breed
class Breed:
    # Constructor
    def __init__(self, breed=""):
        self.breed = breed

    # Method gets breed
    def get_breed(self):
        return self.breed
    # Method sets breed
    def set_breed(self, breed):
        self.breed = breed