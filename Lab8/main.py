import writer, example

#Start project

if __name__ == "__main__":
    try:
        x = int(input("Enter x (in radians): "))
        try:
            result = example.calculate(x)

            writer.wr_bin("Res.bin", result)
            print("Res bin: ", writer.rd_bin("Res.bin"))

            writer.wr_txt("Res.txt", result)
            print("Res txt: ", writer.rd_txt("Res.txt"))

        except ArithmeticError as ex:
            print("Error: Divine to zero")

    except ValueError:
        print("Error: Wrong type number")