import matrix

#Start project

if __name__ == '__main__':
    #Size square matrix
    size = int(input("Введіть розмір квадратної матриці: "))

    #Filler square matrix
    filler = input("Введіть символ-заповнювач: ")

    matrix.write_file(matrix.create_matrix(size, filler))
