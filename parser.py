# single int in the string
import re
string1 = "498results should get"
x = int(re.search(r'\d+', string1).group())
print x

# for multiple ints in the string, type list of ints
import re
string1 = "498results sh22ould get"
x = map(int, re.findall(r'\d+', string1))
print x
