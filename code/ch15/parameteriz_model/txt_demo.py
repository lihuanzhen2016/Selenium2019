file_info = open('D:\\demo\\userdata.txt', 'r')
values = file_info.readlines()
# print(values)
file_info.close()

for item in values:
    data1 = item.split(',')[0]#第一列
    data2 = item.split(',')[1]  # 第二列
    print (data1,data2)
