#Class Master implements master
class Master:
    #Constructor
    def __init__(self, name_master="", number=""):
        self.name_master = name_master
        self.number = number

    #Method gets name master
    def get_name_master(self):
        return self.name_master

    # Method sets name master
    def set_name_master(self, name_master):
        self.name_master = name_master

    # Method gets number master
    def get_number(self):
        return self.number

    # Method sets number master
    def set_number(self, number):
        self.number = number
