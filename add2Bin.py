a = '001'
b = '101'

c = bin(int(a,2) + int(b,2))
d = c.split('0b')
print(d[1])
