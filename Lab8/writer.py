import os
import struct

#Write in text file
def wr_txt(f_name, result):
    with open(f_name, 'w') as f:
        f.write(f"{result:.6f}\n")

#Read in text file
def rd_txt(f_name):
    try:
        if os.path.exists(f_name):
            with open(f_name, 'r') as f:
                result = float(f.readline())
            return result
    except FileNotFoundError as ex:
        return "File {f_name} not found"

#Write in bin file
def wr_bin(f_name, result):
    with open(f_name, 'wb') as f:
        f.write(struct.pack('d', result))

#Read in bin file
def rd_bin(f_name):
    try:
        with open(f_name, 'rb') as f:
            result = struct.unpack('d', f.read(8))[0]
        return result
    except FileNotFoundError as ex:
        print(ex)
        return "File {f_name} not found"
