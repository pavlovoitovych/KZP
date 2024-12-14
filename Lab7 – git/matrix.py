
#Write a matrix in file
def write_file(arr):
    with open("MyFile.txt", "w") as fout:
        for row in arr:
            row_str = ' '.join(row)
            print(row_str)
            fout.write(row_str + '\n')

#Create matrix
def create_matrix(size, filler):
    if len(filler) != 1:
        print("Wrong filler")
        return

    arr = []

    for i in range(size):
        row = [' '] * (i + 1)
        for j in range(i + 1):
            if i + j >= size - 1:
                row[j] = filler
        arr.append(row)

    return arr