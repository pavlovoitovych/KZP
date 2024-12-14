#Class Collar implements collar
class Collar:
    #Constuctor
    def __init__(self, collar=False):
        self.collar = collar

    # Method gets presence collar

    def get_presence(self):
        return self.collar
    # Method sets presence collar
    def set_presence(self, collar):
        self.collar = collar