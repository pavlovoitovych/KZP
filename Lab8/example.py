import math

#calculate example cos(x)/sin(x)
def calculate(x):
    try:
        return math.cos(x) / math.sin(x)
    except ArithmeticError:
        raise ArithmeticError