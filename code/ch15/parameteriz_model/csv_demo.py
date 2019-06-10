import csv

data=csv.reader(open('D:\\demo\\userdata.csv','r'))
for user in data:
    print(user[0])